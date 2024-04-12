package section4.lec18

import section4.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1_000),
        Fruit(2, "사과", 1_200),
        Fruit(3, "사과", 1_200),
        Fruit(4, "사과", 1_500),
        Fruit(5, "바나나", 3_000),
        Fruit(6, "바나나", 3_200),
        Fruit(7, "바나나", 2_500),
        Fruit(8, "수박", 10_000),
    )

    // all:  조건을 모두 만족하면 true 그렇지 않으면 false
    val isAllApple = fruits.all { it.name == "사과" }

    // none: 조건을 모두 불만족하면 true 그렇지 않으면 false
    val isNoApple = fruits.none { fruits -> fruits.name == "사과" }

    // any: 조건을 하나라도 만족하면 true 그렇지 않으면 false
    val isNoApple2 = fruits.any { fruit -> fruit.price >= 10_000 }

    // count: 개수를 센다. (size랑 같음)
    val fruitCount = fruits.count()

    // sortedBy: 오름차순 정렬을 한다
    val fruitCount2 = fruits.sortedBy { fruit -> fruit.price }

    // sortedByDescending: 내림차순 정렬을 한다
    val fruitCount3 = fruits.sortedByDescending { fruit -> fruit.price }

    // distinctby: 변형된 값을 기준으로 중복을 제거한다
    val distinctFruitNames = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    // first: 첫번째 값을 가져온다 (무조건 null이 아니어야함)
    // firstOrNull: 첫번째 값 또는 null을 가져온다
    val firstFruit = fruits.first()   //비어있는 리스트는 exception을 던짐
    val firstFruitOrNull = fruits.firstOrNull()

    // last
    // lastOrNull:

    // 과일이름 -> List<과일> Map이 필요 할 경우
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    // id -> 과일 Map이 필요할 경우
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }
    // associateBy는 id를 통해서 뭔가 매핑해야할때 즉, 중복되지 않는 키를 가지고 맵을 만들떄 사용한다

    // 과일 이름 -> List<출고가> Map이 필요해요
    val map3: Map<String, List<Int>> = fruits
        .groupBy({ fruit -> fruit.name }, {fruit -> fruit.price})

    // id -> 출고가 map
    val map4: Map<Long, Int> = fruits
        .associateBy({fruit -> fruit.id}, {fruit -> fruit.price})
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}


