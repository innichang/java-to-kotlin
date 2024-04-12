package section4.lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean = fruit.name == "사과"   //fun 뒤에 함수 이름이 없는걸 볼 수 있다
    //Fruit를 파라미터로 받아 Boolean을 반환하는 타입의 함수
    //소괄호 내부에 파라미터 타임, 화살표, 반환타입

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }          //이 방법을 많이 사용한다

//    isApple(fruits[0])
//    isApple.invoke(fruits[1])
//    isApple2(fruits[2])
//    isApple.invoke(fruits[3])

//    filterFruits(fruits, isApple)
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과" })
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    filterFruits(fruits) { fruit -> fruit.name == "사과" } //Fruit -> Boolean이여서 타입 추론 가능
    filterFruits(fruits) { it.name == "사과" } //파라미터가 1개 일때 'it'이 들어오는 fruit이 된다

    var targetFruitName = "바나나"
    targetFruitName = "수박"
    filterFruits(fruits) { it.name == targetFruitName } //final이 아니여도 아무런 문제 없이 작동한다

    /*
    코틀린에서는 람다가 시작하는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있다.

    Closure 조금 더 찾아보기
    람다가 실행되는 시점에 쓰고 있는 변수들을 모두 포획한 데이터 그조를 Closure라고 부른다
     */
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean //함수 자체를 파라미터로 받아서 필터링한다
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for(fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}


