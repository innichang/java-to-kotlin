package section3.lec14.dataclass

data class PersonDto(
    val name: String,
    val age: Int
)

/*
data 키워드를 사용하면 equals, hashcode, toString을 자동으로 만들어준다.

named argument까지 활용하면 builder pattern을 사용하는 것과 같은 효과도 있다.
 */