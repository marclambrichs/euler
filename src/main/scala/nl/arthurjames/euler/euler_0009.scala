package nl.arthurjames.euler

/** Problem 9: Special Pythagorean Triplet
  *
  * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  * Find the product abc.def
  */
@main def euler_0009: Unit =
  println(res.head)

val res = for
  b <- 2 to 1000
  a <- 1 until b
  c = 1000 - a - b
  if a * a + b * b == c * c
yield a * b * c
