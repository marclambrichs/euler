package nl.arthurjames.euler

import scala.io.Source
import scala.util.Sorting._

/** Problem 22: Names Scores
  *
  * Using names.txt, a 46K text file containing over five-thousand first names,
  * begin by sorting it into alphabetical order. Then working out the
  * alphabetical value for each name, multiply this value by its alphabetical
  * position in the list to obtain a name score.
  *
  * What is the total of all the name scores in the file?
  *
  * @author:
  *   Marc Lambrichs
  */
@main def euler_0022 =
  val filename = "src/main/resources/0022_names.txt"
  val names =
    Source.fromFile(filename).getLines.next.split(",").map(onlyLetters(_))
  val tuples = names.sorted.zip(LazyList.from(1))
  val res = tuples.map((name, pos) => alphaScore(name) * pos).sum
  println(res)

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

def onlyLetters(s: String): String =
  s.filter(alphabet.indexOf(_) >= 0)

def alphaScore(s: String): Long =
  s.toList.map(alphabet.indexOf(_) + 1).sum
