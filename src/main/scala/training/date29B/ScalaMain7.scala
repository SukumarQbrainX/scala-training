package training.date29B

object ScalaMain7 extends App {

  val list = List(1, 2, 3, 4, 5, 6)

  val list1 = list.filter(int => int % 2 == 0)

  val list2 = list.map(int => int * int)

  list.foreach(int => {
    println("Int ")
    println(int)
  })

  println(list)
  println(list1)
  println(list2)

}
