package section3.lec10

import section3.lec10.Animal

class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("고양이가 걸어가~")
    }

}

/*
extends 키워드를 사용하지 않그 ':'를 사용해서 상속한다

코틀린에서는 무조건 상위 클래스의 생성자를 바로 호출해야한다.

override를 필수적으로 붙여 주어야한다
 */