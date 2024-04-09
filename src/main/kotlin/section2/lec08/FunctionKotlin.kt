package section2.lec08//public fun max(a: Int, b: Int): Int {
//    if (a> b) {
//        return a;
//    }
//    return b;
//}

/*
1. access modifier public은 코틀린에서 생략이 가능하다.
2. 매개변수명: 타입
3. 함수가 하나의 결과값이다면, block 대신에 '=' 을 사용 가능하다
 */

//fun max(a: Int, b: Int): Int =
//    if (a > b) {
//        a
//    } else {
//        b
//    }

/*
1. 어떤 결과든 Int타입을 반환하기 때문에 반환 타입 생략이 가능하다.(또, 중괄호를 쓰는 대신에 '=' 을 썼기 때문이다)
2. 중괄호를 빼고 if else 를 한줄에 적을 수도있따
 */

fun max(a: Int, b: Int) = if (a > b) a else b

/*
함수는 클래스 안에 있을 수도, 파일 최상단에 있을 수도 있고, 한파일 안에 여러 함수들이 있을 수도 있다.
 */

fun main() {
    repeat("Hello World", 10, false)
    repeat("Hello World")

    //NAMED ARGUMENT
    repeat("Hello World", useNewLine = false)

    //이렇게 이름에 성별, 성별에 이름을 실수로 넣을 수도 있다.
    printNameAndGender("FEMALE","Amy")

    //마치 빌더를 쓰는것같은 장점
    printNameAndGender(name = "장인석", gender = "MALE")


    //가변인자
    printAll("A", "B", "C")
    val array = arrayOf("A", "B", "C")

    //배열을 가변인자에 넣어줄때 앞에 별표를 붙여줘야한다.
    //spread 연산자. 배열안에 요소들을 그냥 ','를 쓰는것처럼 꺼내준다
    printAll(*array)
}

//DEFAULT PARAMETER
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

//가변 인자(같은 타입의 여러 파라미터 받기)
fun printAll(vararg strings: String) {     //vararg = var argument
    for(str in strings) {
        println(str)
    }
}


