package nl.arthurjames.euler

/** Problem 3: Largest Prime Factor
  *
  * The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143 ?
  *
  * @author:
  *   Marc Lambrichs
  */

@main def euler_0003(): Unit =
  var number = 600851475143L
  println(factors(number).last)

def factors(n: Long): List[Long] =
  (2 to math.sqrt(n).toInt)
    .find(n % _ == 0)
    .fold(List(n))(i => i.toLong :: factors(n / i))
