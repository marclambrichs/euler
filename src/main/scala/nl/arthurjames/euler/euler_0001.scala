package nl.arthurjames.euler

/** Problem 1 If we list all the natural numbers below 10 that are multiples of
  * 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum
  * of all the multiples of 3 or 5 below 1000.
  *
  * @author
  *   : Marc Lambrichs
  */
@main def euler_0001(): Unit =
  println(sumList(factorsofThreeOrFive(1000)))

def factorsofThreeOrFive(ceiling: Int): List[Int] =
  List.range(1, 1000).filter(x => x % 5 == 0 || x % 3 == 0)

def sumList(digits: List[Int]): Int = digits.sum
