package training.date0408

object ImmutableMain extends App {

  val set = Set(1, 2, 3, 4, 5)

  val set1: Set[Int] = set + 6

  val set2 = Set(10, 11)

  val set3 = set ++ set2

  println(set)
  println(set1)
  println(set3)

  val list = List(1,2,3,4,5)

  val list1 = list :+ 2
  val list2 = 3 +: list

  val list3 = list1 ::: list2

  println(list1)
  println(list2)
  println(list3)
}
