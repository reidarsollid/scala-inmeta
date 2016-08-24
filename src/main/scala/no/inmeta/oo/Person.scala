package no.inmeta.oo

class Person(val name: String = "Jan Johansen", var age: Int) {
  def this(name: String) = this(name, 20)

  override def toString : String = {
    s"$name ${age}"
  }

}
