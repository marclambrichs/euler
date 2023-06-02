package nl.arthurjames.euler

class euler0019Test extends munit.FunSuite {
  test("Euler Problem 19: test leap year") {
    assertEquals(isLeapYear(1900), false)
    assertEquals(isLeapYear(2000), true)
  }
  test("Euler Problem 19: test nrOfDays") {
    assertEquals(nrOfDays.length, 1212)
    assertEquals(
      nrOfDays.toList.take(12),
      List(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    )
  }
  test("Euler Problem 19: test first day of month") {
    assertEquals(
      firstDayOfMonth(nrOfDays.toList).take(12),
      List(1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6)
    )
  }

}
