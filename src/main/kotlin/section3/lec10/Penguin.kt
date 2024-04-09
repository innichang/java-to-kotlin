package section3.lec10

class Penguin(
    species: String,
) : Animal(species, 2), Swimmable, Flyable {
    private val wingCount: Int = 2
    override fun move() {
        println("펭귄이 움직인다~")
    }

    //Animal에서 legCount 프로퍼티에 open이라는 키워드를 붙혀야 프로퍼티 오바라이드가 가능하다
    //프로퍼티에 대한 오버라이딩을 할때, 추상 프로퍼티가 아니라면 꼭 open을 붙혀줘야한다
    override val legCount: Int
        get() = super.legCount + this.wingCount
    override val swimAbility: Int
        get() = 3

    override fun act() {
        //중복되는 인터페이스를 특정할때는 super<타입>.함수 를 사용한다
        super<Swimmable>.act()
        super<Flyable>.act()
    }

}