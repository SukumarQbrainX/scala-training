package training.date2707

object StackableTraits extends App {

  trait A {

    def print(): Unit
  }

  trait B extends A {

    abstract override def print(): Unit = {
      super.print()
      println("B")
    }
  }

  trait C extends A {

    abstract override def print(): Unit = {
      super.print()
      println("C")
    }
  }

  trait D extends A {

    override def print(): Unit = {
      println("D")
    }
  }

  class AImpl extends D with B with C

  val a = new AImpl
  val b = new D with B with C

  a.print()
  b.print()

  class X

  class Y extends X {

    override def toString: String = {
      super.toString
    }
  }
}
