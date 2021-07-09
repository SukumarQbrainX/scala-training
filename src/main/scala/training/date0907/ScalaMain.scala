package training.date0907

object ScalaMain extends App {

  val a1: Int => Int = (input: Int) => input + 1

  def fxn(input: Int): Int = input + 1

  val a2 : Function1[Int, Double] = a => a.toDouble
  val a21 : Int => Double = a => a.toDouble

  val b1: Function2[Int, Double, String] = (a, b) => a + " " + b
  val b11: (Int, Double) => String = (a, b) => a + " " + b

  val c1: (Int, Int, Int, Int, Int, Int, Int, Int, Int,
    Int, Int, Int, Int, Int, Int, Int,
    Int, Int, Int, Int, Int, Int) => String =
    (a0: Int, a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int,
                                                                                                                                      a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int,
                                                                                                                                      a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int) => ""

  println(">>>>>>>>>>>>>>>>>>>>>>>")

  println(a2.isInstanceOf[Function1[Int, Double]])
  println(a21.isInstanceOf[Function1[Int, Double]])

//  println(c1.isInstanceOf[Function22[Int, Int]])

  println(a2.isInstanceOf[Int => Double])
  println(a21.isInstanceOf[Int => Double])

  println(b1.isInstanceOf[Function2[Int, Double, String]])
  println(b11.isInstanceOf[Function2[Int, Double, String]])
  println(b1.isInstanceOf[(Int, Double) => String])
  println(b11.isInstanceOf[(Int, Double) => String])

  println(">>>>>>>>>>>>>>>>>>>>>>>")

  println(a1(1))
  println(a1(2))
  println(a1(3))
  println(">>>>>>>>>>>>>>>>>>")
  println(a1.apply(1))
  println(a1.apply(2))
  println(a1.apply(3))
  println(">>>>>>>>>>>>>>>>>>")
  println(fxn(1))
  println(fxn(2))
  println(fxn(3))
  println(fxn(4))

  def calculator(a: Int, b: Int)(fxn: (Int, Int) => Int): Int = {
    fxn.apply(a, b)
  }
}
