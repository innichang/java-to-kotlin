package section3.lec14.enumclass

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("한국")
        Country.AMERICA -> println("미국")
    }
}
enum class Country (
    private val code: String
){
    KOREA("KO"),
    AMERICA("US");
}

