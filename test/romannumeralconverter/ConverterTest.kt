package romannumeralconverter

import convertWithMap
import convertWithStrings
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConverterTest {

    @Test
    fun `should convert I to 1`() {
        assertEquals(1, convertWithMap("I"))
        assertEquals(1, convertWithStrings("I"))
    }

    @Test
    fun `should convert II to 2`() {
        assertEquals(2, convertWithMap("II"))
        assertEquals(2, convertWithStrings("II"))
    }

    @Test
    fun `should convert III to 3`() {
        assertEquals(3, convertWithMap("III"))
        assertEquals(3, convertWithStrings("III"))
    }

    @Test
    fun `should convert IV to 4`() {
        assertEquals(4, convertWithMap("IV"))
        assertEquals(4, convertWithStrings("IV"))
    }

    @Test
    fun `should convert V to 5`() {
        assertEquals(5, convertWithMap("V"))
        assertEquals(5, convertWithStrings("V"))
    }

    @Test
    fun `should convert VI to 6`() {
        assertEquals(6, convertWithMap("VI"))
        assertEquals(6, convertWithStrings("VI"))
    }

    @Test
    fun `should convert VIII to 8`() {
        assertEquals(8, convertWithMap("VIII"))
        assertEquals(8, convertWithStrings("VIII"))
    }

    @Test
    fun `should convert IX to 9`() {
        assertEquals(9, convertWithMap("IX"))
        assertEquals(9, convertWithStrings("IX"))
    }

    @Test
    fun `should convert XIV to 14`() {
        assertEquals(14, convertWithMap("XIV"))
        assertEquals(14, convertWithStrings("XIV"))
    }

    @Test
    fun `should convert XXIX to 29`() {
        assertEquals(29, convertWithMap("XXIX"))
        assertEquals(29, convertWithStrings("XXIX"))
    }
}