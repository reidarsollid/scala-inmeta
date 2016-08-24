package inmeta.recursion

import scala.util.control.TailCalls._

class Trampolining {
  def isEven(xs: List[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(true) else tailcall(isOdd(xs.tail))

  def isOdd(xs: List[Int]): TailRec[Boolean] =
    if(xs.isEmpty) done(false) else tailcall(isEven(xs.tail))
}

object Main extends App {
  val trampo = new Trampolining
  println(trampo.isEven((1 to 1000).toList).result)
}
