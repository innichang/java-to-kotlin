package section4.lec16

fun main() {
    var string: String = "string"
    println(string.lastChar())

    val train: Train = Train()
    train.isExpensive() //Train의 확장함수가 불린다

    val srt1: Train = Srt()
    srt1.isExpensive() //Train의 확장함수가 불린다

    val srt2: Srt = Srt()
    srt2.isExpensive()  //Srt의 확장함수가 불린다
}


/*확장 함수
코틀린은 자바와 100% 호환하는 것을 목표로 한다.
그래서 기존 java 코드 위에 자연스럽게 코틀린 코드를 추가할 수는 없을까?라는 고민을하기 시작한다.
Java로 만들어진 라이브러리를 유지보수, 확장할때, 코틀린 코드를 덧붙이고 싶어라 생각했고,

어떤 클래스 안에 있는 메소드처럼 호출할 수 있지만, 함수는 밖에 만들 수 있게 하자!
 */

//String클래스에 들어있는것같은 확장함수
fun String.lastChar(): Char {      //String. 으로 String 클래스를 확장 하는것을 명시
    return this[this.length-1]     // this를 이용해 실제 클래스 안의 값에 접근
}

//val String.lastChar: Char        //프로퍼티처럼도 사용이 가능하다
//    get() = this[this.length-1]

/*
확장함수는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다.

Q: 멤버 함수와, 확장함수의 시그니처가 같다면???
A: 멤버 함수가 호출된다!
    확장함수를 만들었지만, 다른 기능의 똑같은 멤버함수가 생기면. 오류가 발생할 수 있다!

Q: 확장함수가 override 된다면?
A: 아래 예시에 Train에 대해서도 isExpensive가 있고, Srt에 대해서도 isExpensive가 있다.
여기서 Train혹은 Srt변수를 만들고, 변수에 대해서 isExpensive 를 부르면?

    val train: Train = Train()
    train.isExpensive() //Train의 확장함수가 불린다

    val srt1: Train = Srt()
    srt1.isExpensive() //Train의 확장함수가 불린다

    val srt2: Srt = Srt()
    srt2.isExpensive()  //Srt의 확장함수가 불린다

    해당 변수의 현재 타입이 어떤 확장함수가 호출되는지 정해진다.
*/
open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장 함수")
    return this.price >= 10_000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("SRT의 확장함수")
    return this.price >= 10_000
}


/*
정리

1. 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다
2. 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
3. 확장함수는 현재 타입을 기준으로 호출된다.
 */