package training.date2607

object Main2 extends App {

  val calculator: Calculator = new Calculator with Adder
    with Subtractor with Multiplier with Divider

  println(calculator.add(1,2))
  println(calculator.sub(1,2))
  println(calculator.mul(3, 2))
  println(calculator.divide(4, 2))
}
