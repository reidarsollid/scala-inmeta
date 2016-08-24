package inmeta

object PartialFunction extends App {

    def concatUpper(firstString: String, secondString: String): String =
      (firstString + " " + secondString).toUpperCase

    println(concatUpper("hello", "functions"))

    val partialConcatUpper = concatUpper("short", _: String)

    println(partialConcatUpper("pants"))

}

