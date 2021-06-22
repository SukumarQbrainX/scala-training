package training.date22

trait ScalaTrait1 {

  def print(): Unit
}

trait ScalaTrait2 {

  def print1(): Unit
}

class ScalaTrait1Impl1 extends ScalaTrait1 with ScalaTrait2 {
  override def print(): Unit = ???

  override def print1(): Unit = ???
}
