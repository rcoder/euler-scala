package net.rcoder.euler

import Stream._
import annotation.tailrec

object Numerics {
    def factors(n: Long): Seq[Long] = {
        (1L until math.sqrt(n).toLong+1).filter(n % _ == 0) ++ List(n)
    }

    def isPrime(n: Long): Boolean = {
        factors(n).length < 3
    }

    def primeFactors(n: Long): Seq[Long] = {
        factors(n).filter(isPrime(_))
    }

    def gcd(x: Long, y: Long): Long = {
        if (y == 0) x else gcd(y, x % y)
    }

    def lcm(x: Long, y: Long): Long = {
        x * (y / gcd(x, y))
    }

    def longS(init: Long, step: Long): Stream[Long] = {
        cons(init, longS(init + step, step))
    }

    def nats:  Stream[Long] = longS(1, 1)
    def evens: Stream[Long] = longS(2, 2)
    def odds:  Stream[Long] = longS(3, 2)

    def sieve(count: Int): Long = {
        @tailrec def _filt(seen: Stream[Long], iters: Int): Long = {
            val n = seen.head
            val rest = seen.tail.filter(i => i % n != 0)
            if (iters >= count) n else _filt(rest, iters+1)
        }

        count match {
            case 0 => 1
            case 1 => 1
            case 2 => 2
            case _ => _filt(odds, 2)
        }
    }
}

// vim: set ts=4 sw=4 et:
