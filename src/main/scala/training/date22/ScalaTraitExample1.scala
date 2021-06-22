package training.date22

trait ScalaTraitExample1 {

  val variable: Int

  def variable1: Int
}

class ScalaTraitExample1Impl extends ScalaTraitExample1 {
  override val variable: Int = 23

  override def variable1: Int = 44
}
