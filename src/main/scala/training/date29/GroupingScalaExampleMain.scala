package training.date29

object GroupingScalaExampleMain extends App {

  def add(a: Int)(b: Int): Int = a + b

  val a: Int = add(1)(2)

  println(a)

  def add1(a: Int): Int => Int = fsdsd => a + fsdsd

  val b: Int => Int = add1(1)
  val c: Int = b(1)

  val a1: Int = add(1)(2)
  val b1: Int = add1(1)(2)

  val a2: Int => Int = add(1)
  val b2: Int => Int = add1(1)

  val a3: Int = a2(1)
  val b3: Int = b2(1)

  println(b)
  println(c)

  def sub(a: Int)(b: Int)(c: Int): Int = -a-b-c

  val x: Int = sub(1)(2)(3)
  val x1: Int => Int = sub(1)(2)
  val x11: Int = x1(3)

  val x2: Int => Int => Int = sub(1)
  val x21: Int => Int = x2(2)
  val x22: Int = x21(23)

  val x3: Int => Int => Int => Int = sub
  val x31: Int => Int => Int = x3(1)
  val x32: Int => Int = x31(2)
  val x33: Int = x32(3)

  println(x33)
  println(sub(1)(2)(3))

  def sayName(name: String)(rollNumber: Int)(mobile: Long): String =
    name + rollNumber + mobile

  val y: String => Int => Long => String = sayName
  val y1: Int => Long => String = y("Hello")
  val y2: Long => String = y1(1)
  val y3: String = y2(1L)

  println(y3)

  println(sayName("sdasd")(212)(212L))
}
