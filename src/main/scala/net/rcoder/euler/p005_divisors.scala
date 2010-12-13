package net.rcoder.euler

object p005_divisors {
    def main(args: Array[String]): Unit = {
        val result = (1L until 21L).foldLeft(1L)(Numerics.lcm(_, _))
        println(result)
    }
}

// vim: set ts=4 sw=4 et:
