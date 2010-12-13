package net.rcoder.euler

object p001_multiples {
    def main(args: Array[String]): Unit = {
        val range = 1 until 1000
        val multiples = range.filter(x => x % 3 == 0 || x % 5 == 0)
        val result = multiples.toList.sum

        println(result)
    }
}

// vim: set ts=4 sw=4 et:
