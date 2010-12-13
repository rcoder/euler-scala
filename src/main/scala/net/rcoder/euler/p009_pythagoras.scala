package net.rcoder.euler

object p009_pythagoras {
    def lhs(x: Long, y: Long): Long = {
        x*x + y*y
    }

    def main(args: Array[String]): Unit = {
        val valRange = (1L until 999L)
        val squares = valRange.map(i => i*i)
        val sqrtMap = squares.zip(valRange).toMap

        val sumsOfSquares = Comb.pairs(valRange).filter(p => squares.contains(lhs(p._1, p._2)))
        val triples = sumsOfSquares.map(p => (p._1, p._2, sqrtMap.get(lhs(p._1, p._2))))

        val option = triples.find(t => t match {
            case (x, y, Some(z)) => x + y + z == 1000L
            case (_, _, None) => false
        })

        val result = (option match {
            case Some(t) => (t._1 * t._2 * t._3.getOrElse(0L))
            case _ => -1
        })

        println(result)
    }
}

// vim: set ts=4 sw=4 et:
