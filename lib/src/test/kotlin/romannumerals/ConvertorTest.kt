package romannumerals

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ConvertorTest {
    @Test
    fun givenToNumeral_when1_thenI() {
        val convertor = Convertor()
        val result = convertor.toNumeral(1)
        assertThat(result).isEqualTo("I")
    }
    @Test
    fun givenToNumeral_when2_thenII() {
        val convertor = Convertor()
        val result = convertor.toNumeral(2)
        assertThat(result).isEqualTo("II")
    }
    @Test
    fun givenToNumeral_when3_thenIII() {
        val convertor = Convertor()
        val result = convertor.toNumeral(3)
        assertThat(result).isEqualTo("III")
    }
    @Test
    fun givenToNumeral_when4_thenIV() {
        val convertor = Convertor()
        val result = convertor.toNumeral(4)
        assertThat(result).isEqualTo("IV")
    }
    @Test
    fun givenToNumeral_when5_thenV() {
        val convertor = Convertor()
        val result = convertor.toNumeral(5)
        assertThat(result).isEqualTo("V")
    }
    @Test
    fun givenToNumeral_when6_thenVI() {
        val convertor = Convertor()
        val result = convertor.toNumeral(6)
        assertThat(result).isEqualTo("VI")
    }
    @Test
    fun givenToNumeral_when9_thenIX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(9)
        assertThat(result).isEqualTo("IX")
    }
    @Test
    fun givenToNumeral_when10_thenX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(10)
        assertThat(result).isEqualTo("X")
    }
    @Test
    fun givenToNumeral_when10_thenXI() {
        val convertor = Convertor()
        val result = convertor.toNumeral(11)
        assertThat(result).isEqualTo("XI")
    }
    @Test
    fun givenToNumeral_when14_thenXIV() {
        val convertor = Convertor()
        val result = convertor.toNumeral(14)
        assertThat(result).isEqualTo("XIV")
    }
    @Test
    fun givenToNumeral_when16_thenXVI() {
        val convertor = Convertor()
        val result = convertor.toNumeral(16)
        assertThat(result).isEqualTo("XVI")
    }
    @Test
    fun givenToNumeral_when19_thenXIX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(19)
        assertThat(result).isEqualTo("XIX")
    }
    @Test
    fun givenToNumeral_when20_thenXX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(20)
        assertThat(result).isEqualTo("XX")
    }
    @Test
    fun givenToNumeral_when21_thenXI() {
        val convertor = Convertor()
        val result = convertor.toNumeral(21)
        assertThat(result).isEqualTo("XXI")
    }
    @Test
    fun givenToNumeral_when40_thenXL() {
        val convertor = Convertor()
        val result = convertor.toNumeral(40)
        assertThat(result).isEqualTo("XL")
    }
    @Test
    fun givenToNumeral_when41_thenXLI() {
        val convertor = Convertor()
        val result = convertor.toNumeral(41)
        assertThat(result).isEqualTo("XLI")
    }
    @Test
    fun givenToNumeral_when50_thenL() {
        val convertor = Convertor()
        val result = convertor.toNumeral(50)
        assertThat(result).isEqualTo("L")
    }
    @Test
    fun givenToNumeral_when90_thenXC() {
        val convertor = Convertor()
        val result = convertor.toNumeral(90)
        assertThat(result).isEqualTo("XC")
    }
    @Test
    fun givenToNumeral_when100_thenC() {
        val convertor = Convertor()
        val result = convertor.toNumeral(100)
        assertThat(result).isEqualTo("C")
    }
    @Test
    fun givenToNumeral_when200_thenCC() {
        val convertor = Convertor()
        val result = convertor.toNumeral(200)
        assertThat(result).isEqualTo("CC")
    }
    @Test
    fun givenToNumeral_when399_thenCCCXCIX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(399)
        assertThat(result).isEqualTo("CCCXCIX")
    }
    @Test
    fun givenToNumeral_when400_thenCD() {
        val convertor = Convertor()
        val result = convertor.toNumeral(400)
        assertThat(result).isEqualTo("CD")
    }
    @Test
    fun givenToNumeral_when499_thenCCDXCIX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(499)
        assertThat(result).isEqualTo("CDXCIX")
    }
    @Test
    fun givenToNumeral_when500_thenD() {
        val convertor = Convertor()
        val result = convertor.toNumeral(500)
        assertThat(result).isEqualTo("D")
    }
    @Test
    fun givenToNumeral_when899_thenDCCCXCIX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(899)
        assertThat(result).isEqualTo("DCCCXCIX")
    }
    @Test
    fun givenToNumeral_when900_thenCM() {
        val convertor = Convertor()
        val result = convertor.toNumeral(900)
        assertThat(result).isEqualTo("CM")
    }
    @Test
    fun givenToNumeral_when999_thenCMXCIX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(999)
        assertThat(result).isEqualTo("CMXCIX")
    }
    @Test
    fun givenToNumeral_when1000_thenM() {
        val convertor = Convertor()
        val result = convertor.toNumeral(1000)
        assertThat(result).isEqualTo("M")
    }
    @Test
    fun givenToNumeral_when3999_thenMMMCMXCIX() {
        val convertor = Convertor()
        val result = convertor.toNumeral(3999)
        assertThat(result).isEqualTo("MMMCMXCIX")
    }
}
