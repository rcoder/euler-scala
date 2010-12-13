package net.rcoder.euler

object p016_pow2sum {
    def main(args: Array[String]): Unit = {
        var num = BigInt(2).pow(1000)
        var digits = num.toString.split("").tail.map(_.toInt)
        println(digits.sum)
    }
}

// vim: set ts=4 sw=4 et:
