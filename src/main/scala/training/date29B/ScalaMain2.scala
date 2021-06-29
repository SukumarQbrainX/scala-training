package training.date29B

object ScalaMain2 extends App {

  def add(a: Int, b: Int): String => Int =
    c => a + b + Integer.parseInt(c)

  val a: String => Int = add(1, 2)
  val a1: Int = a("3")

  println(a1)
}
