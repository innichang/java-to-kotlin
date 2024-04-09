package section3.lec10

fun main() {
    Derived(300)
    /*
    출력 결과
    Base Class
    0
    Derived Class

    상위 클래스 생성자가 실행되는 동안,
    하위 클래스 프로퍼티, 즉 Derived를 인스턴스화 한다는 말은
    Derived에 있는 number에 값을 집어넣는 다는건데,
    상위 클래스에서 넘버를 호출하게 되면, 하위 클래스에 있는 넘버를 가져 오는데,
    근데 아직 상위 클래스에 constructor가 아직 실행하는 단계이고
    하위 클래스 number는 초기화가 되지 않아 Int의 기본값인 0 이 나오는 거다

    하위 클래스에서 override하고 있는 프로퍼티에 접근 불가

    ****중요****
    - 상위 클래스를 설계할 때 생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야 한다


    키워드 정리
    1. final: override를 할 수 없게 한다. default로 보이지 않게 존재한다
    2. open: override를 열어준다
    3. abstract: 반드시 override 해야 한다
    4. override: 상위 타입을 오버라이드한다


    코틀린에서 상속을 다루는 방법
    - 상속 또는 구현을 할 때에 ":" 을 사용해야한다.
    - 상위 클래스 상속을 구현할 때 생성자를 반드시 호출해야한다.
    - override를 필수로 붙여야 한다
    - 추상 멤버가 아니면 기본적으로 오버라이드가 불가능하다.
        - open을 사용해 주어야 한다.
    - 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 얘기치 못한 버그가 생길 수 있다.

     */

}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}