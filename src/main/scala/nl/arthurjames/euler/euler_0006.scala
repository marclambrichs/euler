package nl.arthurjames.euler

/** Problem 6: Sum Square Difference
  *
  * Find the difference between the sum of the squares of the first one hundred
  * natural numbers and the square of the sum.
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0006: Unit =
  def square(n: Int) = n * n
  val numbers = (1 to 100)
  val res = square(numbers.sum) - numbers.map(square).sum
  println(res)
