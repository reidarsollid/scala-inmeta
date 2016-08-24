package inmeta.recursion

import scala.annotation.tailrec

object Gcd extends App {

  @tailrec
  def gcd(a: Int, b: Int): Int = {
    b match {
      case 0 => a
      case _ => gcd(b, a % b)
    }
  }

  print(gcd(259, 111))
}
