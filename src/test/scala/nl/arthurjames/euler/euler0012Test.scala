package nl.arthurjames.euler

class euler0012Test extends munit.FunSuite:
  test("Euler Problem 12: test triangle") {
    assertEquals(triangle(7), 28)
  }
  test("Euler Problem 12: test factors") {
    assertEquals(factors(28), List(1, 2, 4, 7, 14, 28))
  }
  test("Euler Problem 12: test nrOfFactors") {
    assertEquals(nrOfFactors(28), 6)
  }
