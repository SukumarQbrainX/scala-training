package training.date2007

object ScalaMain1 extends App {

  class X
  class Y extends X
  class Z extends Y

  class A[T >: Y](val data: T)

  val x: Z = new Z

  val a= new A(x)

  println(a.data)
}
