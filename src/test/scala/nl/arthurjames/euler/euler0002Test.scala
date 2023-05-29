package nl.arthurjames.euler

class euler0002Test extends munit.FunSuite:
  val ceiling = 4000000
  def res = fibFrom(1, 2).filter(_ % 2 == 0).takeWhile(_ <= ceiling)
  test("Euler Problem 0002 test") {
    assertEquals(res.sum, 4613732)
  }
