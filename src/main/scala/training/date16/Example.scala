package training.date16

class Example {

  val variable: Int = 23

  var variable1: Int = 24

  def print(): Unit = {
    println(variable)
    println(variable1)
  }

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def +(example: Example): Int = {
    this.variable1 + variable1
  }
}
