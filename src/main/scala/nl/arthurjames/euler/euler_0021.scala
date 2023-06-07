package nl.arthurjames.euler

/** Problem 21: Amicable Numbers
  *
  * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
  * which divide evenly into n). If d(a) = b and d(b) = a where a != b, then a
  * and b are an amicable pair and each of a and b are called amicable numbers.\
  *
  * For example, proper divisors of 220 are 1,2,4,5,10,11,20,22,44,55 and 110.
  * Therefore d(220) = 284. The proper divisors of 284 are 1,2,71, and 142; so
  * d(284) = 220.
  *
  * Evaluate the sum of all the amicable numbers under 10000.
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0021: Unit =
  val dsums = (0 until 10000).map(factors)
  val res = dsums.zipWithIndex
    .filter((sum, idx) => sum < 10000 && dsums(sum) != sum && dsums(sum) == idx)
    .map(_._1)
    .sum
  println(res)

def factors(n: Int): Int =
  (1 to (n / 2)).filter(n % _ == 0).sum
