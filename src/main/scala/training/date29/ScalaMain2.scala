package training.date29

object ScalaMain2 extends App {

  def highOrderFxn(a: Int, b: Int, fxn: (Int, Int) => Int): Int = fxn(a, b)

  println(highOrderFxn(1, 2, (a, b) => a + b))
  println(highOrderFxn(1, 2, (a, b) => a - b))
  println(highOrderFxn(1, 2, (a, b) => a * b))
  println(highOrderFxn(1, 2, (a, b) => a / b))

  println(highOrderFxn(1, 2, (a, b) => {
    println("High order example")
    a + b + 1
  }))

  def add(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b

  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Int, b: Int): Int = a / b

  println(highOrderFxn(1, 2, add))
  println(highOrderFxn(1, 2, subtract))
  println(highOrderFxn(1, 2, divide))
  println(highOrderFxn(1, 2, multiply))

  def sayHello(name: String, fxn1: String => String): String =
    fxn1(name)

  println(sayHello("Deepa", a => {
    println(a)
    s"Hello $a"
  }))

  val fxn: (String, Int, Double) => String = (a, b, c) => {
    println(a)
    println(b)
    println(c)
    a + b + c
  }
}
