package section2.lec06

fun main() {
    val numbers = listOf(1L,2L,3L)
    for (number in numbers){
        println(number)
    }






    //i가 올라갈때
    for(i in 1..3) {
        println(i)
    }

    //i가 내려갈때
    for (i in 3 downTo 1) {
        println(i)
    }

    //2 칸씩 올라갈때
    for (i in 1..5 step 2) {
        println(i)
    }

    //downTo와 step도 함수다
    // 1..5 step 2
    // 1부터 5까지 공차가 1인 등차수열 생성
    // 등차 수열에 대한 함수 호출, 등차수열.step(2)
    // 1 부터 5까지 공차가 2인 등차수열이 나온다

    //코틀린에서 전통적인 for문은 등차수열을 사용한다


}