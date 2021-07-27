package training.date2707

object ScalaMain2 {

  type X = (String, String)

  def printTuple(data: X): Unit = {
    println(data._1)
    println(data._2)
  }

  val a2: X = ("Sas", "Asas")

  printTuple(("Hello", "Hello"))

  val a: (String, String) = ("Hello", "111")
  val a1: X = ("Hello", "111")
}
