package section4.lec16

fun main() {

}

class Person(var firstName: String, var lastName: String, var age: Int)

//fun createPerson(firstName: String, lastName: String): Person {
//    if (firstName.isEmpty()) {
//        throw IllegalArgumentException("firstName은 비어있을 수 없습니다! 현재 값: $firstName")
//    }
//
//    if (lastName.isEmpty()) {
//        throw IllegalArgumentException("lastName은 비어있을 수 없습니다! 현재값: $lastName")
//    }
//
//    return Person(firstName, lastName, 1)
//}

fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if(name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값: $name")

        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}


/*
지역함수
- 함수 안에 함수를 선언할 수 있다.

depth가 깊어지고, 코드가 그렇게 깔끔해지기 않는다...
 */