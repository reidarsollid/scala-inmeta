package inmeta.caseclasses

sealed trait Msg

case class Hello(name: String) extends Msg

case class Message(user: String, message: String) extends Msg

case object Goodbye extends Msg

object PatternMatching extends App {

  def sendMessage(message: Msg) = message match {
    case Hello(name) =>
      println(s"Hello $name")

    case Message(user, message) =>
      println(s"$user :  $message")

    case Goodbye =>
      println("Bye")
  }

  sendMessage(Hello("Glenn"))
  sendMessage(Message("Glenn", "Hadde det bare bra på pappaperm"))
  sendMessage(Goodbye)
}
