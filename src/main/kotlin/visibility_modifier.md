### Java Access Modifiers

1. public 
    - 모든 곳에서 접근 가능

2. protected
   - 같은 패키지 또는 하위 클래스에서만 접근 가능

3. default
    - 같은 패키지에서만 접근 가능

4. private
    - 선언된 클래스 내에서만 접근 가능



### Kotlin Access Modifiers

1. public
    - 모든 곳에서 접근 가능

2. protected
    - 선언된 클래스 또는 하위 클래스에서만 접근 가능
      - Java에서 하위 클래스 및 본인 자신에서도 protected를 접근할 수 있고, 같은 패키지에서 가능했는데,
      - 코틀린에서는 같은 패키지가 빠졌다~
      - **코틀린에서는 패키지라는 개념을 namespace를 관리하기 위한 용도로만 사용하지, 가시성 제어에는 사용되지 않는다!**

3. ~~default~~  internal
    - ~~같은 패키지에서만 접근 가능~~
    - 같은 모듈에서만 접근 가능

4. private
    - 선언된 클래스내에서만 접근 가능

### Kotlin 파일에 Access Modifier 붙히기

1. public : 기본값
2. protected : 파일 최상단에는 사용 불가
3. internal : 같은 모듈에서만 접근 가능
4. private: 같은 파일 내에서만 접근 가능

### 생성자에 access modifier

생성자에 접근 지시어를 붙이려면 constructor을 써줘야 한다.
```Java
open class Cat protected constructor (
        
)
```

### 프로퍼티에  access modifier

```Java
class Car(
        internal val name: String,
        _price: Int
)

    var price = _price
        private set 
```

위처럼 한번에 모든 getter/setter에 접근 지시어를 정할 수 있고,
custom getter/setter을 만들면서 추가로 가시성을 부여할 수 있다



### Java 와 Kotlin 을 함께 사용할 때 주의할점
- Internal는 바이트 코드상 public이 된다. 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.
- 
