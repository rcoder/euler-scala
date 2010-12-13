package net.rcoder.euler

object p006_squares {
    def sumOfSquares(n: Long): Long = {
        (1L until n).map(n => n*n).sum
    }

    def squareOfSums(n: Long): Long = {
        val sN = (1L until n).sum
        sN*sN
    }

    def main(args: Array[String]): Unit = {
        val s1 = sumOfSquares(101)
        val s2 = squareOfSums(101)
        println(math.abs(s1 - s2))
    }
}

// vim: set ts=4 sw=4 et:
