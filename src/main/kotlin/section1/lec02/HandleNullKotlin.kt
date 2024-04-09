package section1.lec02

class HandleNullKotlin {

    fun startsWithA1(str: String?): Boolean {
        return str?.startsWith("A")
            ?: throw IllegalArgumentException("str is null")
    }

    fun startsWithA2(str: String?): Boolean? { //null이 들어갈 수 있는 boolean type
        return str?.startsWith("A")
    }

    fun startsWithA3(str: String?): Boolean {
        return str?.startsWith("A") ?: false
    }

    fun startsWithA(str: String?): Boolean {
        return str!!.startsWith("A")
    }
}