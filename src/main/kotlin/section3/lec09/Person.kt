package section3.lec09

//class Person constructor(val name: String, var age: Int){

//constructor라는 지시어는 생략 가능

//class Person (name: String, age: Int){
//    val name = name
//    var age = age
//
//    //필드만 만들면 getter, setter를 자동으로 만들어준다
//}

//생성자에서 바로 프로퍼티를 만들 수 있따
//class Person(
//    val name: String,
//    var age: Int) {
//
//}

class Person(
    name: String = "장인석",  //Primary Constructor(주 생성자) 반드시 존재해야한다
    var age: Int = 29   //주 생성자에 파라미터가 하나도 없으면 생략 가능
) {
    //NAME을 SET하면 UPPERCASE로 바꾸기

    var setUppercaseName = name
        set(value) {
            field = value.uppercase()
        }
    /*
    Setter를 써야해서, var을 사용한다

    들어오는 파라미터를 대문자로 바꿔서 자기 자신(field)에 사용한다

    Setter 자체를 지양하기 때문에 customer setter도 잘 안쓴다
     */

   //NAME을 GET하면 UPPERCASE로 바꾸기
//    fun getUppercaseName(): String = this.name.uppercase()

    val uppercaseName: String
        get() = this.name.uppercase()

    val name = name
        get() = field.uppercase()
    /*
    name 에 대한 Customer getter을 만들때 field 사용

    밖에서 name을 불렀을때 해당 customer getter가 불린다.
    get 을 부르면 name을 호출되고
    안에서 name이라하면, name의 getter가 호출되어서
    무한 루프가 발생한다

    무한 루프를 막기 위한 예약어, 자기 자신을 가리킨다

    자기 자신을 가르키는 보이지 않는 필드다~ 해서 backing field라 불린다
     */


    //클래스가 초괴화되는 시점에 한번 호출되는 block
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    //생성자를 추가할 경우 나이 고정하기
    constructor(name: String) : this(name, 1) {//this는 위에있는 생성자를 호출한다
        println("부생성자1")
    }
    //부 생성자. 있을 수 있고 없을 수 있다.
    //최종적으로 주생성자를 this.로 호출해야한다
    //부생성자는 body를 가질 수 있다

    constructor() : this("장인석") {
        println("부생성자 2")  //부생성자2는 부생성자1을 호출하고 부생성자1은 주생성자를 호출한다
        //최종적으로 주생성자 호추하는 예시
    }

    //여기서 Person()호출하면,
    //초기화 블록 -> 부생성자1 -> 부생성자2 순서대로 찍힌다
    //역순으로 실행!
    //부생성자보다는 default Parameter 을 권장한다

//    fun isAdult(): Boolean = this.age >= 20

    //Custom Getter
    val isAdult: Boolean
        get() = this.age >= 20

    /*isAdult에 여러 방법이 있는데, property인것처럼 접근하냐, 함수인것처럼 접근하냐의 차이다
        객체의 속성이라면, customer getter
        그렇지 아니면 함수

        isAdult -> 이 사람은 성인인가? 마치 사람의 속성 같음
    * */
}

// .필드를 통해 바로 getter,setter 호출 가능

fun main() {
    val person = Person("장인석", 17)
    println(person.name) //getter
    person.age = 10 //setter
    println(person.age)

    //자바 클래스도 .필드로 바로 사용할 수 있다
    val person2 = JavaPerson("민슬아", 34)
    println("JavaPerson ${person2.name}")

    val person3 = Person("애기")
    println("person3의 나이는 ${person3.age}")

    println("peron은 어른입니다: ${person.isAdult}")
}

/*
    - 코틀린에서는 필드를 만들면 getter와 (필요에 따라) setter 가 자동으로 생긴다.
        -> 때문에 이를 프로퍼티라고 부른다
    - 코틀린에서는 주생성자가 필수이다.
    - constructor 키워드를 사용해 부생성자를 추가로 만들 수 있다.
        -> 단, default parameter이나 정적 팩토리 메소드를 추천한다.
    - 실제 메모리에 존재하는 것과 무관하게 custom getter와 customer setter를 만들 수 있다
        - 무한 루프가 발생할때 field라는 키워드를 쓰는데 backing field라고 불린다
 */
