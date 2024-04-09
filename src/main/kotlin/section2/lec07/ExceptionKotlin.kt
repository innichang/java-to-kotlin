package section2.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun main() {
    readFile()
}
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

//자바와 다르게 코틀린은 Checked Exception과 Unchecked Exception을 구분하지 않는다.
//모두 Unchecked Exception이어서 자바와 다르게 메소드 이름 옆에 'throw xxxxException'표기를 안해줘도 된다.

fun readFile(path: String) {
    //try with resources 구문사용하지않고, 코틀린 스타일로 개편됐다.
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }

    //use 는 inline 확장 함수


    /*
     try catch finally 구문은 문법적으로 완전히 동일하다.
     하지만 코틀린에서는 try catch가 expression이다
     코틀린의 모든 예외는 Unchecked Exception이다.
     코틀린에서는 try with resources 구문이 없다. 대신 코틀린의 언어적 특징을 활용해 close를 호출해준다
     */
}