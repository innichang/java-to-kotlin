package section3.lec14.sealedclass

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when(car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("쏘나타", 2_000L)
class Grandeur : HyundaiCar("그랜저", 3_000L)


/*
상속이 가능하도록 추상 클래스를 만들고 싶은데, 외부에서는 이 클래스를 상속 받지 않으면 좋을때 사용하는 클래스

컴파일 타임 때 하위 클래스의 타입을 모두 기억한다
즉, 런타임때 클래스 타입이 추가될 수 없다.

하위 클래스는 같은 패키지에 있어야 한다.

Enum과 다른점
- 클래스를 상속 받을 수 있다.
- 하위 클래스는 멀티 인스턴스가 가능하다


컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
즉, 런타임때 클래스 타입이 추가될 수 없다.
 */