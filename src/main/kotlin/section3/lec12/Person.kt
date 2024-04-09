package section3.lec12

fun main() {
    Singleton.a
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}


class Person private constructor (
    var name: String,
    var age: Int
) {
    /*
    static: 클래스가 인스턴스화 될때 새로운 값이 복제되는게 아니라 정적으로 인스턴스끼리의 값을 공유
    companion object: 클래스와 동행하는 유일한 오브젝트
        - 하나의 객체로 간주된다
        - 이름을 붙일 수 있다.
        - interface를 구현할 수도 있다.

        - 유틸성 함수들을 넣어도 되지만, 최상단 파일을 활용하는 것을 추천한다.

        Java에서 코틀린에 있는 static field나 static function을 사용하고 싶은 경우 (lec12 JavaPerson 참조)

        @JvmStatic을 사용하면 바로 사용할 수 있다.

     */
    companion object Factory : Log {  //Java 의 Static과 동일
        private const val MIN_AGE = 1
        /*
        val 은 런타임에 변수에 값이 할당된다.
        const val 은 컴파일시에 변수에 값이 할당된다
        const는 진짜 상수에 붙이기 위한 용도.
        기본 타입과 String에만 붙일 수 있다.
         */

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행 객체 Factory입니다.")
        }
    }
}

object Singleton {
    var a: Int = 0
}