package nl.arthurjames.euler

/** Problem 15: Lattice Paths
  *
  * Starting in the top left corner of a 2 x 2 grid, and only being able to move
  * to the right and down, there are exactly 6 routes to the bottom right
  * corner. How many routes are there through a 20 x 20 grid?
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0015: Unit =
  val twenty = factorial(20)
  val res = factorial(40) / (twenty * twenty)
  val it1 = factorial.drop(20).next()
  val it2 = factorial.drop(19).next()
  println(res)
  println(it2 / (it1 * it1))

def factorial(n: BigInt): BigInt =
  if n == 0 then 1
  else n * factorial(n - 1)

// or...
val factorial: Iterator[BigInt] =
  Iterator.unfold((BigInt(1), 0)) { case (n, i) =>
    Some((n, (n * (i + 1), i + 1)))
  }
