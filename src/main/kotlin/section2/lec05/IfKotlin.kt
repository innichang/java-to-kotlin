package section2.lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score} cannot be smaller than 0");
    }
}

fun getPassOrFailExpressionStyle(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGradeIn(score: Int): String {
    return if (score in 50..59) {
        "F"
    } else if (score in 60..69) {
        "D"
    } else if (score in 70..79) {
        "C"
    } else if (score in 80..89) {
        "B"
    } else if (score in 90..99) {
        "A"
    } else if (score == 100) {
        "A+"
    } else {
        "BAD"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80.. 89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("common number")
        else -> println("not common number")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("commonn number")
        number % 2 == 0 -> println("even number")
        else -> println("odd number")
    }
}