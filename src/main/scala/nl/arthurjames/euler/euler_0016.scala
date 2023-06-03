package nl.arthurjames.euler

/** Problem 16: Power Digit Sum
  *
  * 2 ** 15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
  *
  * What is the sum of the digits of the number 2 ** 1000?
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0016: Unit =
  println(power(1000).toString.map(_.asDigit).sum)

def power(n: Int): BigInt =
  n match
    case 0 => 1
    case _ => 2 * power(n - 1)
