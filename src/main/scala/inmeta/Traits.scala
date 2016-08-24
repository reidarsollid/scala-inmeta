package inmeta

import scala.collection.mutable.ArrayBuffer

abstract  class IntQueue{
  def get(): Int
  def put(element: Int)
}

trait Doubling extends IntQueue{
  abstract override def put(element: Int){super.put(2 * element)}
}

class BasicIntQueue extends IntQueue {
  private val buffer = new ArrayBuffer[Int]

  def put(element: Int) = {
    buffer += element
  }

  def get() = buffer.remove(0)
}

trait Incrementing extends IntQueue {
  abstract override def put(element: Int) {
    super.put(element + 1)
  }
}

trait Filtering extends IntQueue {
  abstract override def put(element: Int) {
    if (element >= 0) super.put(element)
  }
}

object Main extends App {

  val queue = new BasicIntQueue with Incrementing with Filtering


  queue.put(3)
  queue.put(11)
  //queue.put(-2)

}

class MyQueue extends BasicIntQueue with Doubling with Incrementing with Filtering {

}


