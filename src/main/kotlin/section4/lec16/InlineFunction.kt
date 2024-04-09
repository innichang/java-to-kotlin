package section4.lec16

fun main() {
    3.add3(4)
}


inline fun Int.add3(other:Int): Int {
    return this + other
}


/*
함수를 파라미터로 전달할때 오버헤드를 줄일 수 있다..

하지만 inline 함수의 사용은 성능 축정과 함께 신중하게 사용되어야 한다
 */