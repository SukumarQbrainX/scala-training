package training.date17

object Main1 extends App {

  val diffBWLazyValDef = new DiffBWLazyValDef

  println(">>>>>>>>>>>>>>>")
  println(diffBWLazyValDef.variable1)
  println(diffBWLazyValDef.variable2)
  println(diffBWLazyValDef.variable3)
  println(">>>>>>>>>>>>>>>>")

  println(">>>>>>>>>>>>>>>")
  println(diffBWLazyValDef.variable1)
  println(diffBWLazyValDef.variable2)
  println(diffBWLazyValDef.variable3)
  println(">>>>>>>>>>>>>>>>")

  /**
   * VAL
   * >>>>>>>>>>>>>>
   * 23
   * LAZY
   * 34
   * DEF
   * 44
   * >>>>>>>>>>>>>
   *
   * >>>>>>>>>>>>
   * 23
   * 34
   * DEF
   * 44
   */
}
