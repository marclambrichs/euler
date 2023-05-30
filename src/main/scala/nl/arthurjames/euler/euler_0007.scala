package nl.arthurjames.euler

/** Problem 7: 10001st Prime
  *
  * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
  * that the 6th prime is 13. What is the 10001st prime number?
  *
  * @author:
  *   Marc Lambrichs
  */

@main def euler_0007: Unit =
  println(primes(10000))

def primes: LazyList[Int] = 2 #:: LazyList
  .from(3)
  .filter(i => primes.takeWhile(j => j * j <= i).forall(k => i % k > 0))
