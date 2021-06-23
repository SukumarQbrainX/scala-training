package training.date23

sealed trait Sealed {

  def print(): Unit
}

final class SealedImpl extends Sealed {
  override def print(): Unit = ???
}
final class SealedImpl1 extends Sealed {
  override def print(): Unit = ???
}
final class SealedImpl2 extends Sealed {
  override def print(): Unit = ???
}
