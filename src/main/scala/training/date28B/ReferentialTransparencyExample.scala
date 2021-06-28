package training.date28B

object ReferentialTransparencyExample extends App {

  def sq(x: Int): Int = x * x

  def sq1(x: Int): Int = {
    println(s"X is $x")
    x * x
  }

//  println(sq(12)) // result 144
//
//  println(12 * 12) // 144
//
//  println(144)

  println(sq1(12)) // 144

  println(12 * 12) // 144

  println(144)

}
