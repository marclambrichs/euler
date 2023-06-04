package nl.arthurjames.euler

/** Problem 25: 1000-digit Fibonacci Number
  *
  * The 12th Fibonacci term, is the first term to contain three digits. What is
  * the index of the first term in the Fibonacci sequence to contain 1000
  * digits?
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0025: Unit =
  println(1 + fibs.takeWhile(_.toString.length < 1000).length)

val fibs: LazyList[BigInt] =
  BigInt(1) #:: BigInt(1) #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
