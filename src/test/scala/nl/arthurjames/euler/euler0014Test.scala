package nl.arthurjames.euler

class euler0014Test extends munit.FunSuite:
  test("Euler Problem 14: test collatz") {
    assertEquals(collatz(1L), 4L)
    assertEquals(collatz(13L), 40L)
    assertEquals(collatz(20L), 10L)
  }
  test("Euler Problem 14: test collatzSeq") {
    assertEquals(
      collatzSeq(13L),
      List[Long](13L, 40L, 20L, 10L, 5L, 16L, 8L, 4L, 2L, 1L)
    )
  }
  test("Euler Problem 14: test collatzSeqLen") {
    assertEquals(collatzLen(1, 999999), 259)
  }
  test("Euler Problem 14: test max") {
    assertEquals(max((345, 222), (345, 223)), (345, 223))
    assertEquals(max((234, 222), (345, 223)), (345, 223))
    assertEquals(max((345, 222), (234, 223)), (345, 222))
  }
