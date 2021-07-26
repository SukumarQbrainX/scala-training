package training.date2607

trait Calculator {

  def add(a: Int, b: Int): Int = ???

  def sub(a: Int, b: Int): Int = ???

  def mul(a: Int, b: Int): Int = ???

  def divide(a: Int, b: Int): Int = ???
}

trait Adder {
  self: Calculator =>

  override def add(a: Int, b: Int): Int = a + b
}

trait Subtractor {
  self: Calculator =>

  override def sub(a: Int, b: Int): Int = a - b

}


trait Multiplier {
  self: Calculator =>

  override def mul(a: Int, b: Int): Int = a * b

}

trait Divider {
  self: Calculator =>

  override def divide(a: Int, b: Int): Int = a / b
}


