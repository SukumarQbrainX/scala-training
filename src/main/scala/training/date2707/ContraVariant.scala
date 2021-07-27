package training.date2707

object ContraVariant extends App {

  trait A {
    override def toString: String = "A"
  }

  trait A1 extends A {
    override def toString: String = "A1"
  }

  trait B[-T] {
    def print(value: T): Unit
  }

  class BImpl extends B[A] {
    override def print(value: A): Unit =
      println(value.toString)
  }

  class BImpl1 extends B[A1] {
    override def print(value: A1): Unit = {
      println(value.toString)
    }
  }

  def print(bValue: B[A1], a1: A1): Unit = {
    bValue.print(a1)
  }

  val a1: A1 = new A1 {}

  val b1: B[A1] = new BImpl1
  val b2: B[A] = new BImpl

  print(b1, a1)
  print(b2, a1)
}
