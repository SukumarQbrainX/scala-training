package training.date30B

object Main extends App {

  println(lengthCount("Hello"))
  println(lengthCount("Scala"))
  println(lengthCount("Java"))

  println(lengthCount(null))

  def lengthCount(input: String): Int =
    input.length
}
