package no.inmeta.functional

object Lists extends App {
  val aList = List(1, 2, 3)
  val bList = List(4, 5, 6)
  val cList = aList :: bList :: Nil

  println(cList.flatten)

  val dList = List(7 ,8, 9)
  val eList = List(aList, dList)
  println(eList.flatten)

  def addOne(input: Int): Int = input + 1


  def f(input: List[Int]): List[Int] = input.map(i => addOne(i))
  val mappedList = eList.map(p => f(p))
  println(mappedList)

  val flattMappedList = eList.flatMap( p => f(p))
  println(flattMappedList)
}
