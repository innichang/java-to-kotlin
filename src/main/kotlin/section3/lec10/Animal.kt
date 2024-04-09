package section3.lec10

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
    //프로퍼티를 오머라이드할때 무조건 open을 붙혀줘야한다
) {
    abstract fun move()

}

