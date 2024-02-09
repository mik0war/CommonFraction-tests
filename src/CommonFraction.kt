data class CommonFraction(
val numerator: Int,
val denominator: Int
) {
    fun plus(secondFraction: CommonFraction): CommonFraction {
        val numerator = numerator * secondFraction.denominator + secondFraction.numerator * denominator
        val denominator = denominator * secondFraction.denominator

        println("$numerator $denominator")
        return simplify(numerator, denominator)
    }

    fun minus(secondFraction: CommonFraction): CommonFraction {
        return CommonFraction(1, 0)
    }

    fun multiply(secondFraction: CommonFraction): CommonFraction {
        return CommonFraction(1, 0)
    }

    fun divide(secondFraction: CommonFraction): CommonFraction {
        return CommonFraction(1, 0)
    }

    private fun simplify(numerator : Int, denominator: Int): CommonFraction{
        var a = numerator.coerceAtLeast(denominator)
        var b = numerator.coerceAtMost(denominator)

        while(a != b){
            if (a > b)
                a -= b
            else
                b -= a
        }

        return CommonFraction(numerator/a, denominator/b)
    }
}