package net.rcoder.euler

object p002_fibonacci {
    import Stream._

    def fib(n: Int): Int = {
        n match {
            case 0 => 0
            case 1 => 1
            case _ => fib(n - 2) + fib(n - 1)
        }
    }

    def main(args: Array[String]): Unit = {
        val fibonaccis = Stream.from(1).map(fib)

        val evenFibs = fibonaccis.filter(_ % 2 == 0)
        val result = evenFibs.takeWhile(_ <= 4000000).sum

        println(result)
    }
}
// vim: set ts=4 sw=4 et:
