package inmeta.recursion

import scala.annotation.tailrec

object Tailrec extends App {
  def factorial(number: BigInt): BigInt = {
    @tailrec
    def fact(number: BigInt, accumulator: BigInt): BigInt = number match {
      case _ if number == 1 =>
        accumulator
      case _ =>
        fact(number - 1, number * accumulator)
    }
    fact(number, 1)
  }
  println(factorial(4))
}
