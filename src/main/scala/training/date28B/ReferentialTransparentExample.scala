package training.date28B

class ReferentialTransparentExample {

  val a: Int = 12 * 12

  val b: Int = {
    println("sasasasas")
    12 * 12
  }
}
