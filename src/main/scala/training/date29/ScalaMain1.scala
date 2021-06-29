package training.date29

object ScalaMain1 extends App {

  def add1(a: Int, b: Int): Int = a + b

  val add: (Int, Int) => Double = (a, b) => (a + b) / 2

  val increment = (a: Int) => a + 1

  val name: String => String = na => s"Hello $na"

  println(add(1, 7))
  println(add(1, 2))
  println(add(1, 9))
  println(add(1, 2))
  println(add(1, 2))

  println(increment(11))
  println(increment(12))

  println(name("Aakash"))
  println(name("Deepa"))
  println(name("Scala"))
}
