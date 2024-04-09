package section3.lec12.anonymousclass

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("움직인다~~")
        }

        override fun fly() {
            println("날아간다~~")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}