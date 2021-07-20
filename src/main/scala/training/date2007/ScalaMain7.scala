package training.date2007

object ScalaMain7 extends App {

  class A (implicit a: Int) {
    println(a)
  }


  val a1: A = new A()(12)
}
