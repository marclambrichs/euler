package nl.arthurjames.euler

/** Problem 10: Summation of Primes
  *
  * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all
  * the primes below two million.
  */
@main def euler_0010: Unit =
  val limit = 2000000
  var res = time(primes.takeWhile(_ < limit).foldLeft(0L)(_ + _))
  println(res)
  res = time(calculatePrimesLazyList(limit).foldLeft(0L)(_ + _))
  println(res)

def calculatePrimesLazyList(end: Int): List[Int] =
  val odds = LazyList.from(3, 2).takeWhile(_ <= Math.sqrt(end).toInt)
  val composites =
    odds.flatMap(i => LazyList.from(i * i, 2 * i).takeWhile(_ <= end))
  LazyList
    .cons(2, LazyList.from(3, 2).takeWhile(_ <= end).diff(composites))
    .toList

lazy val primes: LazyList[Int] = 2 #:: LazyList
  .from(3)
  .filter(i => primes.takeWhile(j => j * j <= i).forall(k => i % k > 0))

def time[R](block: => R): R = {
  val t0 = System.nanoTime()
  val result = block // call-by-name
  val t1 = System.nanoTime()
  println("Elapsed time: " + (t1 - t0) + "ns")
  result
}
