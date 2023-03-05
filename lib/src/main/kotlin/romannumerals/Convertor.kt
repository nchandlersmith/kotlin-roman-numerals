package romannumerals

class Convertor {
    private var numeral = ""
    private var total = 0
    private var intervals: List<Numeral> = listOf(
        Numeral(1000, 3999,"M"),
        Numeral(900, 999,"CM"),
        Numeral(500, 899,"D"),
        Numeral(400, 499,"CD"),
        Numeral(100, 399,"C"),
        Numeral(90, 99,"XC"),
        Numeral(50, 89,"L"),
        Numeral(40, 49,"XL"),
        Numeral(10, 39,"X"),
        Numeral(9, 9,"IX"),
        Numeral(5, 8,"V"),
        Numeral(4, 4,"IV"),
        Numeral(1, 3,"I"),
    )
    fun toNumeral(number: Int): String {
        total = number
        for (interval in intervals) {
            if (total in interval.lowerBound .. interval.upperBound) {
                numeral += interval.representation
                total -= interval.offset
            }
        }
        if (total > 0) {
            toNumeral(total)
        }
        return numeral
    }

    fun toNumber(numeral: String): Int {
        if (numeral == "IV") {
            return 4
        }
        return numeral.fold(0) { acc: Int, _: Char -> acc + 1 }
    }

    data class Numeral(
        val lowerBound: Int,
        val upperBound: Int,
        val representation: String,
        val offset: Int = lowerBound
        )

}
