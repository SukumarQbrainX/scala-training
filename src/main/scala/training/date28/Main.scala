package training.date28

object Main extends App {

  val anyValExample = new AnyValExample

  import anyValExample._

  println(variableInt.isInstanceOf[Int])
//  println(variableInt.isInstanceOf[AnyVal])
  println(variableInt.isInstanceOf[Any])

//  println(variableInt.isInstanceOf[Object])\


  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>")

  println(anyValExample.isInstanceOf[AnyValExample])
    println(anyValExample.isInstanceOf[AnyRef])
  println(anyValExample.isInstanceOf[Any])

    println(anyValExample.isInstanceOf[Object])

  def add(t: InVarianceExample): Int = t.variable
}
