package training.date2707

object Example extends App {

  class A
  class B extends A

  val list: List[A] = List(new A, new A, new A)
  val list1: List[B] = List(new B, new B, new B)

  def print(list: List[A]): Unit = {
    list.foreach(println)
  }

  print(list)
  print(list1)

  val hello: String = "gello"
}
