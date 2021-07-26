package training.date2607

object Main1 extends App {

  val a = new ClassExample

  val b = new ClassExample with ClassExample2

  println(a.add(1,2))
  println(b.add(1,2))
}
