package nl.arthurjames.euler

/** Problem 5: Smallest Multiple
  *
  * 2520 is the smallest number that can be divided by each of the numbers from
  * 1 to 10 without any remainder.
  *
  * What is the smallest positive number that is evenly divisible by all of the
  * numbers from 1 to 20?
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0005: Unit =
  val res = (20 to Int.MaxValue).find(i => (1 to 20).forall(i % _ == 0)).get
  println(res)
