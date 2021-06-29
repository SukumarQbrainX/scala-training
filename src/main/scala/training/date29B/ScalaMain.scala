package training.date29B

object ScalaMain extends App {

  val a: Int = 12

  val add: (Int, Int) => Int = (fff, b) => {
    println("Asdasd")
    fff + b
  }

  val add2: (Int, Int) => Int = (a: Int, b: Int) => a+b

  def add1(a: Int, b: Int): Int = {
    println("Sdasdasd")
    a + b
  }

  println(add(1, 2))
  println(add(1, 3))
  println(add(1, 4))
}
