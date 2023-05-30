package nl.arthurjames.euler

class euler0010Test extends munit.FunSuite:
  val limit = 2000000
  test("Euler Problem 10 test") {
    val res = primes.takeWhile(_ < limit).foldLeft(0L)(_ + _)
    assertEquals(res, 142913828922L)
  }
