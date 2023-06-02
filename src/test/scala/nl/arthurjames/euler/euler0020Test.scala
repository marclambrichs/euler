package nl.arthurjames.euler

class euler0020Test extends munit.FunSuite:
  test("Euler Problem 20: compare factorial methods") {
    assertEquals(factorial.drop(9).next(), factorial(9))
  }
