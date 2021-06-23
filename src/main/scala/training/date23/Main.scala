package training.date23

object Main extends App {

//  class SealedOuter extends SealedImpl2
//
//  val a = new SealedOuter

  println(addInt(1, 2))
  println(addInt(1))
  println(addInt())

  def addInt(a: Int = 0, b: Int = 0): Int = a + b
  def addString(a: String, b: String): String = a + b
//
//  def add(a: Int): Int = a
//
//  def add(): Int = 0

  val scalaExample: ScalaExample = new ScalaExample(34)

  val scalaExample1: ScalaExample = new ScalaExample(2)

  val result: ScalaExample = scalaExample + scalaExample1

  println(result.a)

  val result1: ScalaExample = result + scalaExample1
  println(result1.a)

  println(1 + 2)

  println(1.+(2))

  val single: Single = new SingleChild
//  val single1: SingleChild = new Single

  println(single.increment(33))

  println(single.isInstanceOf[SingleChild])

  val singleChild: SingleChild = single.asInstanceOf[SingleChild]


  if (single.isInstanceOf[SingleChild]) {
    single.asInstanceOf[SingleChild]
  }

  // Up casting, down casting, liskov substitution principle


  println(singleChild)

  val scalaExample2: ScalaExample2 = new ScalaExample2Impl
println(">>>>>>>>>>>>>>>>>>>")
  println(scalaExample2.variable1)
  println(scalaExample2.variable2)
  println(scalaExample2.variable1)
  println(scalaExample2.variable2)

  val javaMain = new JavaMain

  println(javaMain.isInstanceOf[Object])
println(">>>>>>>>>")
  println(singleChild.isInstanceOf[AnyRef])
}
