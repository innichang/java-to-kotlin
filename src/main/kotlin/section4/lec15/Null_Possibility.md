### 컬렉션의 null 가능성, Java와 함꼐 사용하기

1. List<Int?>

    리스트에는 null이 들어갈 수 있지만, 리스트는 절대 null이 아님

2. List<Int>?

    리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음

3. List<Int?>?

    리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음


? 위치에 따라 null 가능성 의미가 달라지므로 차이를 잘 이해해야 한다.


### Java는 읽기 전용 컬렉션과 변경 가능 컬렉션을 구분하지 않는다,
그러므로 자바와 코틀린을 같이 사용할때

1. 코틀린의 불변 리스트를 자바가 가져가서 변경해서 다시 코틀린으로 다시 가져가는 타입
2. 자바는 nullable타입과 non-nullable타입을 구분하지 않는다.
   - 자바가 코틀른의 non-nullable 리스트를 가져가서 null을 놓고 돌려줄 경우

Kotlin 쪽의 컬렉션이 Java에서 호출되면 컬렉션 내용이 변할 수 있음을 감안해야 한다.
코틀린 쪽에서 Collections.unmodifiableXXX()를 활용하면 변경 자체를 막을 수는 있다.

Collections.unmodifiableList()
Collections,unmodifiableMap()

코틀린에서 Java 컬렉션을 사용할건지

1. 코틀린에서 자바 컬렉션을 가져다 사용할때 플랫폼 타입을 신경써야한다
   - 자바에서 List<Integer>을 주는데, 위의 3개중 어떤거인지?? 모른다
   - 자바 코드를 보며, 맥락을 확인하고, Java코드를 가져오는 지점을 Wrapping해서 영향 범위 최소화


