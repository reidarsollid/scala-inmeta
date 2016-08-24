package inmeta

object Lists extends App {

  val intList = List(1,2,3,4,5)

  val addedTwoList = intList.map( s => s + 2)

  addedTwoList.foreach(print)

}
