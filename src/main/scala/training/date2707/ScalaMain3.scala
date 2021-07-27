package training.date2707

object ScalaMain3 extends App {

  trait A {
    type TypeA

    val a: TypeA
  }

  trait B[TypeB] {

    val b: TypeB
  }

  class AImpl extends A {
    override type TypeA = Int
    override val a: Int = 0
  }

  class BImpl extends B[Int] {
    override val b: Int = 0
  }

  type int = Boolean

  val a: int = 23 > 0
}
