private val romanMap = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10
    // etc
)

private fun Char?.value(): Int = if (this == null) 0 else romanMap[this] ?: 0

private fun getNextValue(roman: String, i: Int) = if (i + 1 == roman.length) 0 else roman[i + 1].value()

fun convertWithMap(roman: String) = roman.mapIndexed { i, char ->
    val currentValue = char.value()
    return@mapIndexed if (currentValue >= getNextValue(roman, i)) {
        currentValue
    } else {
        -currentValue
    }
}.sum()

fun convertWithStrings(roman: String) = roman
    .replace("IX", "VIIII")
    .replace("X", "VV")
    .replace("IV", "IIII")
    .replace("V", "IIIII")
    .length
