package section4.lec15

/*
불변인지 가변인지 무조건 설정해줘야한다

가변(Mutable) 컬렉션: 컬렉션에 element를 추가, 삭제할 수 있다.
불변: 컬렉션에 element를 추가, 삭제할 수 없다.

하지만, 불변 타입이라 하더라도 Reference Type인 Element의 필드는 바꿀 수 있다.
 */

fun main() {
    //불변
    val numbers = listOf(100, 200)  //이 경우 element의 타입이 추론되어서 <> 타입 생략 가능
    val emptyList = emptyList<Int>()  //비어있는 리스트를 만들때는 들어올 타입을 명시해야 한다.
    printNumbers(emptyList()) //이 경우 emptyList를 받는 printNumbers에 들어가는 타입이 명시되어 추론이 되어 생략 가능


    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

    //가변
    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)
}

private fun printNumbers(numbers: List<Int>) {

}


/*
TIP
- 우선 불변 리스트를 만들고, 곡 필요한 경우 가변 리스트로 바꾸자!
    - 코드 깔끔
    - 붋필요한 가변 리스트 사용이 들어진다
 */


fun set() {
    //불변
    val numbers = setOf(100, 200)

    //가변
    val numbers2 = mutableSetOf(100, 200)

    //For Each
    for (number in numbers) {
        println(number)
    }

    //전통적인 For 문
    for ((index, number) in numbers.withIndex()) {
        println("$index $number")
    }
}

fun map() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "Monday", 2 to "Tuesday")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}
