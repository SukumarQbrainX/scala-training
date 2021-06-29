package training.date29

object ScalaMain3 extends App {

  def sayHello(name: String): String => String = hello => s"$hello + $name"

  val a: String => String = sayHello("Deepa")

  println(a("Hello"))
  println(a("Hello1"))
  println(a("Hello1"))

  println(sayHello("Deepa")("Hello"))
  println(sayHello("Deepa")("Hello1"))
  println(sayHello("Deepa")("Hello2"))

  val a1: String => String = sayHello("Aakash")
  val a2: String = sayHello("Aakasj")("Hello")

  def add(a: Int)(b: String)(c: Double)(d: Boolean): String = b + a + c + d

  val a3: String = add(1)("Hello")(12.2)(true)
  val a4: String = add(1)("Hello")(12.2)(false)


}
