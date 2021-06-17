package training.date17

class DiffBWLazyValDef {


  val variable1: Int = {
    println("VAL")
    23
  }

  lazy val variable2: Int = {
    println("LAZY")
    34
  }

  def variable3: Int = {
    println("DEF")
    44
  }
}
