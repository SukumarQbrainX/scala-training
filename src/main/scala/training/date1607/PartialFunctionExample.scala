package training.date1607

object PartialFunctionExample extends App {

  // f(x) = 20 / x

  val partialFunction = new PartialFunction[Int, Int] {
    override def isDefinedAt(x: Int): Boolean = x != 0

    override def apply(v1: Int): Int = 20 / v1
  }

  def f(x: Int): Option[Int] = {
    if (partialFunction.isDefinedAt(x)) {
      Some(partialFunction(x))
    } else {
      None
    }
  }

  println(f(0))


  val partialFunction1: PartialFunction[Int, Int] = {
    case x if x != 0 => 20 / x
  }

  println(partialFunction1.apply(10))
  println(partialFunction1(0))

  val a1: Int => Option[Int] = partialFunction1.lift

  println(a1(0))
}
