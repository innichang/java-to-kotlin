package section5

import section3.lec09.Person
import section3.lec14.dataclass.PersonDto


fun main() {
    val person = Person(name = "Inni", age = 30)

    printPerson(person)


    val person2 = Person("Sra", 35)
    with(person2) {
        println(name)
        println(this.age)
    }





    //let 예시
    //하나 이상의 함수를 call chain결과로 호출할때
    val strings = listOf("APPLY", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) }

    //non-null 값에 대해서만 code block을 실행 시킬때
    fun strLength(str: String){
        val length = str?.let {
            println(it.uppercase())
            it.length
        }
    }

    //일회성으로 제한된 영역에 지역 변수를 만들때
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println("Modified First Item: $modifiedFirstItem")


    //run
//    객체 초화와 반환 값의 계산을 동시에 해야할때
//    - 객체를 만들어 DB에 바로 저장하고 그 인스턴스를 활용할때
//    val person2 = Person("Inni", 100).run(personRepository::save)

//    val person2 = Person("Inni", 100).run {
//        hobby = "독서"
//        personRepository.save(this)
//    }

    //apply
//Text Fixture을 만들때
//    fun createPerson(
//        name: String,
//        age: Int,
//        hobby: String,
//    ): Person {
//        return Person(name = name, age = age).apply { this.hobby = hobby }
//    }

//    val person4 = Person("Inni", 100)
//    person.apply { this.growOld() }
//        .let {println(it)}

    //also
    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 지금 값: $it") }
        .add("four")

    //with
//객체를 convert해야하는데 한쪽에 로직을 넣기 어려울때
    return with(person) {
        PersonDto(
            name = name,
            age = age
        )
    }
}

fun printPerson(person: Person?) {

//    if (person != null) {
//        println(person.name)
//        println(person.age)
//    }

    person?.let {  //person이 nullable해서 safe call을 해준다
        println(it.name)
        println(it.age)
    }

    /*
        let: scope function의 한 종류
        일시적인 영역을 생성한다
    */


    val value1 = person?.let {
        p -> p.age
    }

    val value2 = person?.run {
        age
    }

    val value3 = person?.also {
        it.age
    }

    val value4 = person?.apply{
        this.age
    }

    println("value1의 값은 $value1 입니다.")
    println("value2의 값은 $value2 입니다.")
    println("value3의 값은 $value3 입니다.")
    println("value4의 값은 $value4 입니다.")


    println(value3?.age)
    println(value3?.name)
}