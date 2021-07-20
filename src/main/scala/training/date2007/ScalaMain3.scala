package training.date2007

object ScalaMain3 extends App {

  implicit val Zero: Int = 23
  implicit val double = 23.3
  implicit val bool = true
  //  implicit val Zero1: Int = 24

  def add(a: Int, b: Int)(d: Double)(implicit c: Int): Int = a + b

  def add1(a: Int, b: String = "0", c: Int) = ???

  println(add(1, 2)(12.2)(2))

  println(add(1, 2)(12.2))
}
