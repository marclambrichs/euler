package nl.arthurjames.euler

class euler0001Test extends munit.FunSuite:
  test("Euler Problem 0001 test") {
    assertEquals(sumList(factorsofThreeOrFive(1000)), 233168)
  }
