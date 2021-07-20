package training.date2007

object ScalaMain extends App {

  trait X {
    def className: String
  }
  class Y extends X {
    override def className: String = "Y"
  }
  class Z extends Y {
    override def className: String = "Z"
  }
  class W extends X {
    override def className: String = "W"
  }

  class A[T <: X] (val date: T) {
    println(date.className)
  }

  val a = new A(new W)

  println(a.date)
}
