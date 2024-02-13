import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class CommonFractionKtTest {
    @Test
    fun `test toString`() {
        val expected = "1 + i3"
        val actual = Complex(
            numerator = 1.0,
            denominator = 3.0
        )

        assertEquals(expected, actual.toString())
    }

    //plus region
    @Test
    fun `test plus `() {
        val firstComplex = Complex(
            numerator = 1.0,
            denominator = 3.0
        )

        val secondFraction = Complex(
            numerator = 1.0,
            denominator = 3.0
        )

        val expected = Complex(
            numerator = 2.0,
            denominator = 6.0
        )
        val actual: Complex = firstComplex.plus(secondFraction)
        assertEquals(expected, actual)

    }

    @Test(expected = IllegalStateException::class)
    fun `test plus over int`() {
            val firstComplex = Complex(
                numerator = 2000000000.0,
                denominator = 2000000000.0
            )

            val secondFraction = Complex(
                numerator = 2000000000.0,
                denominator = 2000000000.0
            )

            firstComplex.plus(secondFraction)

    }

    // minus region
    @Test
    fun `test minus`() {
        val firstComplex = Complex(
            numerator = 1.0,
            denominator = 3.0
        )

        val secondFraction = Complex(
            numerator = 1.0,
            denominator = 3.0
        )

        val expected = Complex(
            numerator = 2.0,
            denominator = 6.0
        )
        val actual: Complex = firstComplex.minus(secondFraction)
        assertEquals(expected, actual)

    }

    @Test(expected = IllegalStateException::class)
    fun `test minus over int`() {
        val firstComplex = Complex(
            numerator = -2000000000.0,
            denominator = -2000000000.0
        )

        val secondFraction = Complex(
            numerator = 2000000000.0,
            denominator = 2000000000.0
        )

        firstComplex.minus(secondFraction)

    }

    //multiply region

    @Test
    fun `test multiply`() {
        val firstComplex = Complex(
            numerator = 5.0,
            denominator = 3.0
        )

        val secondFraction = Complex(
            numerator = 4.0,
            denominator = 5.0
        )

        val expected = Complex(
            numerator = 5.0,
            denominator = 37.0
        )
        val actual: Complex = firstComplex.multiply(secondFraction)
        assertEquals(expected, actual)

    }

    @Test(expected = IllegalStateException::class)
    fun `test multiply over int`() {
        val firstComplex = Complex(
            numerator = 2000000000.0,
            denominator = 2000000000.0
        )

        val secondFraction = Complex(
            numerator = 2000000000.0,
            denominator = 2000000000.0
        )

        firstComplex.multiply(secondFraction)

    }

    // divide region

    @Test
    fun `test divide`() {
        val firstComplex = Complex(
            numerator = 5.0,
            denominator = 3.0
        )

        val secondFraction = Complex(
            numerator = 4.0,
            denominator = 5.0
        )

        val expected = Complex(
            numerator = 0.85365,
            denominator = 0.31707
        )
        val actual: Complex = firstComplex.divide(secondFraction)
        assertEquals(expected, actual)

    }

}