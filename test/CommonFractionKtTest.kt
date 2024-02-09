import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CommonFractionKtTest {
    @Test
    fun `test toString`() {
        val expected = "1 / 3"
        val actual = CommonFraction(
            numerator = 1,
            denominator = 3
        )

        assertEquals(expected, actual.toString())
    }

    //plus region

    @Test
    fun `test plus common denominators`() {
        val firstFraction = CommonFraction(
            numerator = 1,
            denominator = 3
        )

        val secondFraction = CommonFraction(
            numerator = 1,
            denominator = 3
        )

        val expected = CommonFraction(
            numerator = 2,
            denominator = 3
        )
        val actual: CommonFraction = firstFraction.plus(secondFraction)
        assertEquals(expected, actual)

    }

    @Test
    fun `test plus different denominators`() {
        val firstFraction = CommonFraction(
            numerator = 1,
            denominator = 3
        )

        val secondFraction = CommonFraction(
            numerator = 1,
            denominator = 2
        )

        val expected = CommonFraction(
            numerator = 5,
            denominator = 6
        )
        val actual: CommonFraction = firstFraction.plus(secondFraction)
        assertEquals(expected, actual)

    }

    @Test
    fun `test plus with simplification`() {
        val firstFraction = CommonFraction(
            numerator = 1,
            denominator = 2
        )

        val secondFraction = CommonFraction(
            numerator = 1,
            denominator = 2
        )

        val expected = CommonFraction(
            numerator = 1,
            denominator = 0
        )
        val actual: CommonFraction = firstFraction.plus(secondFraction)
        assertEquals(expected, actual)

    }

    // minus region
    @Test
    fun `test minus with different delimiters`() {
        val firstFraction = CommonFraction(
            numerator = 5,
            denominator = 3
        )

        val secondFraction = CommonFraction(
            numerator = 1,
            denominator = 2
        )

        val expected = CommonFraction(
            numerator = 7,
            denominator = 6
        )
        val actual: CommonFraction = firstFraction.minus(secondFraction)
        assertEquals(expected, actual)

    }

    @Test
    fun `test minus to negative`() {
        val firstFraction = CommonFraction(
            numerator = 4,
            denominator = 3
        )

        val secondFraction = CommonFraction(
            numerator = 5,
            denominator = 3
        )

        val expected = CommonFraction(
            numerator = -1,
            denominator = 3
        )
        val actual: CommonFraction = firstFraction.minus(secondFraction)
        assertEquals(expected, actual)

    }

    @Test
    fun `test minus with simplification`() {
        val firstFraction = CommonFraction(
            numerator = 3,
            denominator = 2
        )

        val secondFraction = CommonFraction(
            numerator = 1,
            denominator = 2
        )

        val expected = CommonFraction(
            numerator = 1,
            denominator = 0
        )
        val actual: CommonFraction = firstFraction.minus(secondFraction)
        assertEquals(expected, actual)

    }

    //multiply region

    @Test
    fun `test multiply`() {
        val firstFraction = CommonFraction(
            numerator = 2,
            denominator = 7
        )

        val secondFraction = CommonFraction(
            numerator = 3,
            denominator = 1
        )

        val expected = CommonFraction(
            numerator = 6,
            denominator = 7
        )
        val actual: CommonFraction = firstFraction.multiply(secondFraction)
        assertEquals(expected, actual)

    }

    @Test
    fun `test multiply with simplification`() {
        val firstFraction = CommonFraction(
            numerator = 2,
            denominator = 5
        )

        val secondFraction = CommonFraction(
            numerator = 5,
            denominator = 7
        )

        val expected = CommonFraction(
            numerator = 2,
            denominator = 7
        )
        val actual: CommonFraction = firstFraction.multiply(secondFraction)
        assertEquals(expected, actual)

    }

    // divide region

    @Test
    fun `test divide`() {
        val firstFraction = CommonFraction(
            numerator = 3,
            denominator = 7
        )

        val secondFraction = CommonFraction(
            numerator = 1,
            denominator = 5
        )

        val expected = CommonFraction(
            numerator = 15,
            denominator = 7
        )
        val actual: CommonFraction = firstFraction.divide(secondFraction)
        assertEquals(expected, actual)

    }

    @Test
    fun `test divide with simplification`() {
        val firstFraction = CommonFraction(
            numerator = 2,
            denominator = 5
        )

        val secondFraction = CommonFraction(
            numerator = 2,
            denominator = 5
        )

        val expected = CommonFraction(
            numerator = 1,
            denominator = 0
        )
        val actual: CommonFraction = firstFraction.divide(secondFraction)
        assertEquals(expected, actual)

    }

}