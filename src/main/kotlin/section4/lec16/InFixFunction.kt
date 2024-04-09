package section4.lec16

fun main() {
    3.add(4)
    3.add2(4)
    3 add2 4   //셋다 같은 결과 반환
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}



/*
중위 함수

 */