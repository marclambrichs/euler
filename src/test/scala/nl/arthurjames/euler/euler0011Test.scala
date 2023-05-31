package nl.arthurjames.euler

class euler0011Test extends munit.FunSuite:
  val rowlength, columnlength = 20

  test("Euler Problem 11: test horizontal") {
    assertEquals(product(0, 1, 4), ns(0) * ns(1) * ns(2) * ns(3))
    assertEquals(product(16, 1, 4), ns(16) * ns(17) * ns(18) * ns(19))
    assertEquals(
      product(0 + columnlength * (rowlength - 1), 1, 4),
      ns(380) * ns(381) * ns(382) * ns(383)
    )
    assertEquals(
      product(rowlength - 4 + columnlength * (rowlength - 1), 1, 4),
      ns(396) * ns(397) * ns(398) * ns(399)
    )
  }
  test("Euler Problem 11: test vertical") {
    assertEquals(product(0, 20, 4), ns(0) * ns(20) * ns(40) * ns(60))
  }
  test("Euler Problem 11: test diagonal right") {
    assertEquals(product(0, 21, 4), ns(0) * ns(21) * ns(42) * ns(63))
  }
  test("Euler Problem 11: test diagonal left") {
    assertEquals(product(3, 19, 4), ns(3) * ns(22) * ns(41) * ns(60))
  }
