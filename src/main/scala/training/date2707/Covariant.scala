package training.date2707

object Covariant extends App {

  trait A

  trait AChild extends A
  trait AChild1 extends A


  class B[+T](val data: T)

  val a: A = new A{}
  val a1: AChild = new AChild{}
  val a2: AChild1 = new AChild1 {}

  val b: B[A] = new B(a)
  val b1: B[AChild] = new B(a1)
  val b2: B[AChild1] = new B(a2)

  def print(b: B[A]): Unit = {
    println(b.data.toString)
  }

  print(b)
  print(b1)
  print(b2)
}
