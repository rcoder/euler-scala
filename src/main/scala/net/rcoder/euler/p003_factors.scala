package net.rcoder.euler

object p003_factors {
    val dividend = 600851475143L

    def main(args: Array[String]): Unit = {
        println(Numerics.primeFactors(dividend).max)
    }
}

// vim: set ts=4 sw=4 et:
