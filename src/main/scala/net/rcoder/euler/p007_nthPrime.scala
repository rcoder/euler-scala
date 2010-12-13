package net.rcoder.euler

object p007_nthPrime {
    def main(args: Array[String]): Unit = {
        val result = Numerics.sieve(10001)
        println(result)
    }
}

// vim: set ts=4 sw=4 et:
