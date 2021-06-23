package training.date23

sealed trait ScalaExample2 {

  var variable0 = 45

  val variable1 : Int

  def variable2: Int
}

final class ScalaExample2Impl extends ScalaExample2 {

  variable0 = 56

  override val variable1: Int = {
    println("VAL override")
    23
  }

  override val variable2: Int = {
    println("DEF override")
    24
  }
}
