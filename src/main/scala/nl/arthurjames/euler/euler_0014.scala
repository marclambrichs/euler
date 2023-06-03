package nl.arthurjames.euler

/** Problem 14: Longest Collatz Sequence
  *
  * The following iterative sequence is defined for the set of positive
  * integers: n -> n / 2 (n is even) n -> 3n + 1 (n is odd)
  *
  * Using the rule above and starting with 13, we generate the following
  * sequence 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
  *
  * It can be seen that this sequence (starting at 13 and finishing at 1)
  * contains 10 terms. Although it has not been proved yet (Collatz Problem), it
  * is thought that all starting numbers finish at 1.
  *
  * Which starting number, under one million, produces the longest chain?
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0014: Unit =
  println((1 to 999999).map(collatzLen(1, _)).view.zip(LazyList.from(1)).max)

def collatz(n: Long): Long =
  n % 2 match
    case 0 => n / 2
    case _ => 3 * n + 1

def collatzSeq(n: Long): List[Long] =
  n match
    case 1 => List(1L)
    case _ => n :: collatzSeq(collatz(n))

def collatzLen(l: Int = 1, n: Long): Int =
  n match
    case 1 => l
    case _ => collatzLen(l + 1, collatz(n))

def max(t1: (Int, Int), t2: (Int, Int)): (Int, Int) =
  if t1._1 > t2._1 then t1 else t2
