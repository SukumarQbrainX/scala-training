package training.date29B

object ScalaMain3 extends App {

  def add(a: Int, b: Int)(c: Int, d: Int)(e: Int): Int =
    a + b + c + d + e

  println(add(1, 2)(3, 4)(2))

  ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"

  def fxn(a: Int): Int => Int = b => a + b

  val a1: Int => Int = fxn(1)
  val a12: Int = a1(2)

  println(a12)

  println(fxn(1)(2))


  ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"


  val x: String = met(1,2)("Hello")(false)
  val x1: Boolean => String = met(1,2)("Hello")
  val x11: String = x1(true)

  val x2: String => (Boolean => String) = met(1,2)
  val x21: Boolean => String = x2("Hello")
  val x22: String = x21(false)

  def met(a: Int, b: Int)(c: String)(d: Boolean): String =
    c + "  " + a + "  " + b + "  " + d

  def met1: (Int, Int) => String => Boolean => String =
    (a, b) => c => d =>  c + "  " + a + "  " + b + "  " + d

  println(met1(1,2)("Sdasdasd")(false))
  println(met(1, 2)("Hello")(true))

  val x3: (Int, Int) => String => Boolean => String = met
  val x31: String => Boolean => String = x3(1,2)
  val x32: Boolean => String = x31("adasdasdasd")
  val x33: String = x32(false)

  val x4: (Int, Int) => String => Boolean => String = met1
  val x41: String => Boolean => String = x4(1,2)
  val x42: Boolean => String = x41("Hello")
  val x43: String = x42(true)
}
