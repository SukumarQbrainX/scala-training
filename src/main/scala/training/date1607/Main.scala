package training.date1607

object Main extends App {

  def f(x: Int)(y: Int)(z: Int): Int = x + y + z

  println(f(1)(2)(3))

  val a1: (Int, Int) => Int = f(1)(_)(_)
  val a2: Int => Int = a1(2, _)

  val x1: Int => Int => Int => Int = f
  val x2: Int => Int => Int = x1(1)
  val x3: Int => Int = x2(2)
  val x4: Int = x3(3)

  println(a2(23))
}
