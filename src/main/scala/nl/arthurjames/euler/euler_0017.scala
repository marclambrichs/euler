package nl.arthurjames.euler

/** Problem 17: Number Letter Counts
  *
  * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
  * then there are 3 + 3 + 5 + 4 + 5 letters used in total. If all the numbers
  * from 1 to 1000 (one thousand) inclusive were written out in words, how many
  * letters would be used?
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0017: Unit =
  val res = LazyList.from(1).take(1000).foldLeft(0)(_ + name(_))
  println(res)

def translate(n: Int): String =
  n match
    case 1   => "one"
    case 2   => "two"
    case 3   => "three"
    case 4   => "four"
    case 5   => "five"
    case 6   => "six"
    case 7   => "seven"
    case 8   => "eight"
    case 9   => "nine"
    case 10  => "ten"
    case 11  => "eleven"
    case 12  => "twelve"
    case 13  => "thirteen"
    case 14  => "fourteen"
    case 15  => "fifteen"
    case 16  => "sixteen"
    case 17  => "seventeen"
    case 18  => "eighteen"
    case 19  => "nineteen"
    case 20  => "twenty"
    case 30  => "thirty"
    case 40  => "forty"
    case 50  => "fifty"
    case 60  => "sixty"
    case 70  => "seventy"
    case 80  => "eighty"
    case 90  => "ninety"
    case 100 => "hundred"

val numbers =
  List(
    "",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen"
  )
    .map(_.length)

val tens = List(
  "",
  "",
  "twenty",
  "thirty",
  "forty",
  "fifty",
  "sixty",
  "seventy",
  "eighty",
  "ninety"
).map(_.length)

val hundred = "hundred".length
val and = "and".length
val thousand = "one thousand".filterNot(_.isWhitespace).length

def name(n: Int): Int =
  n match
    case x if x < 20 => numbers(x)
    case x if x < 100 =>
      tens(x / 10) + (if x % 10 > 0 then numbers(x % 10) else 0)
    case x if x < 1000 =>
      numbers(x / 100) + hundred + (if x % 100 > 0 then name(x % 100) + and
                                    else 0)
    case x if x == 1000 => thousand
