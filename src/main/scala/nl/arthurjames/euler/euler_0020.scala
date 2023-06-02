package nl.arthurjames.euler

/** Problem 20: Factorial Digit Sum
  *
  * n! means n * (n - 1) * ... * 3 * 2 * 1 For example, 10! = 10 * 9 * ... * 3 *
  * 2 * 1 = 3628800 and the sum of the digits in the number 10! is 3 + 6 + 2 + 8
  * + 8 = 27. Find the sum of the digits in the number 100!
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0020: Unit =
  println(factorial(100).toString.map(_.asDigit).sum)

def factorial(n: BigInt): BigInt =
  if n == 0 then 1
  else n * factorial(n - 1)

// Alternative factorial definition
val factorial: Iterator[BigInt] =
  Iterator.unfold((BigInt(1), 0)) { case (n, i) =>
    Some((n, (n * (i + 1), i + 1)))
  }
