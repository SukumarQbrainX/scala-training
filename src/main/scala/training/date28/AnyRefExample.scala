package training.date28

class AnyRefExample {

  val anyRef: AnyRef = "Hello"
  val anyRef1: Any = "Hello"

  override def equals(obj: Any): Boolean = super.equals(obj)
}
