package no.inmeta.oo

import org.scalatest._

class PersonTest extends FunSuite with Matchers {

  test("Create person with default age") {
    val person = new Person(name = "Jan Johansen")
    person.age should be(20)
    person.name should be("Jan Johansen")
  }

  test("Create person with default name") {
    val person = new Person(age = 25)
    person.age should be(25)
  }

}
