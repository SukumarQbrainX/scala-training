package training.date2707

object ScalaMain1 {

  trait A {

    def name: String = "A"

    def printA(): Unit = println(name)
  }

  class AImpl1 extends A {
    override def name: String = "AImpl1"
  }

  class AImpl2 extends AImpl1 {
    override def name: String = "AImpl2"
  }

  class B[T <: A] {

    def printB(input: T): Unit = input.printA()
  }


  class C {

    def printB[T <: A](input: T): Unit = input.printA()
  }

  val b = new B[AImpl1]
  val b1 = new B[AImpl2]
  val b2 = new B[A]

  b.printB(new AImpl1)
  b.printB(new AImpl2)

  b1.printB(new AImpl2)

  b2.printB(new AImpl2)
  b2.printB(new AImpl1)
  b2.printB(new A {})

  val c = new C

  c.printB(new AImpl2)
  c.printB(new AImpl1)
  c.printB(new A{})
}
