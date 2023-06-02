package nl.arthurjames.euler

/** Problem 19: Counting Sundays
  *
  * 1 Jan 1900 was a Monday
  *
  * How many Sundays fell on the first of the month during the twentieth century
  * (1 Jan 1901 to 31 Dec 2000)?
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0019: Unit =
  // we're not interested in nr of days in 1900 and in dec 2000
  val l = firstDayOfMonth(nrOfDays.toList).drop(12).dropRight(1)
  println(l.filter(_ == 0).length)

def isLeapYear(y: Int): Boolean =
  y % 4 == 0 && !(y % 100 == 0 && !(y % 400 == 0))

def daysOfMonth(m: Int, y: Int): Int =
  m match
    case 4 | 6 | 9 | 11               => 30
    case x if x == 2 && isLeapYear(y) => 29
    case 2                            => 28
    case _                            => 31

// calculate list of all nr of days per month
val nrOfDays =
  (1900 to 2000)
    .flatMap(y => (1 to 12).map(m => daysOfMonth(m, y)))

def firstDayOfMonth(nrOfDays: List[Int]): List[Int] =
  var l = List(1)
  for nr <- nrOfDays
  do l = l :+ (l.last + nr) % 7
  l

// or shorter
val firstDays = nrOfDays.toList.scanLeft(1)((a, b) => (a + b) % 7)
