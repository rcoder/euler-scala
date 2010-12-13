package net.rcoder.euler

object p004_palindromes {
    def isPalindrome(s: String): Boolean = {
        val strLen = s.length

        val fstIdx = if (strLen % 2 == 0) strLen/2 else strLen/2+1
        val fst = s.substring(0, fstIdx)
        val snd = s.substring(strLen/2)

        fst == snd.reverse
    }

    def products(range: Range): Set[Int] = {
        range.map(elem => range.map(x => elem * x)).flatten.toSet
    }

    def main(args: Array[String]): Unit = {
        //val all3DigitNums = (100 until 1000)
        val nums = (100 until 1000)
        val numProducts = products(nums)
        val palindromes = numProducts.filter(n => isPalindrome(n.toString))

        println(palindromes.max)
    }
}
// vim: set ts=4 sw=4 et:
