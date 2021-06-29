package training.date29B

object ScalaMain1 extends App {

  def calculator(a: Int, b: Int, operation: (Int, Int) => Int): Int = {
    println("Calculartor My")
    operation(a, b)
  }

  println(calculator(1, 2, (a, b) => a + b))
  println(calculator(1, 2, (a, b) => a - b))
  println(calculator(1, 2, (a, b) => a * b))
  println(calculator(1, 2, (a, b) => a / b))

  println(calculator(1, 2, (a, b) => {
    println("Multiline")
    a + b
  }))

  def add(a: Int, b: Int): Int = a + b
  def sub(a: Int, b: Int): Int = a - b
  def mul(a: Int, b: Int): Int = a * b
  def division(a: Int, b: Int): Int = a / b

  println(calculator(1, 2, add))
  println(calculator(1, 2, sub))
  println(calculator(1, 2, mul))
  println(calculator(1, 2, division))
}
