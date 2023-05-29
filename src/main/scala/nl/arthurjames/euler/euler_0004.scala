package nl.arthurjames.euler

/** Problem 4: Largest Palindrome Product
  *
  * A palindromic number reads the same both ways. The largest palindrome made
  * from the product of two 2-digit numbers is 9009 = 91 × 99.
  *
  * Find the largest palindrome made from the product of two 3-digit numbers.
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0004: Unit =
  val res = (100 to 999)
    .flatMap(i => (i to 999).map(_ * i))
    .filter(n => n.toString == n.toString.reverse)
    .max
  println(res)
