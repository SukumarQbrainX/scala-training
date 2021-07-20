package training.date2007

object ScalaMain6 extends App {

  val list: List[Int] = List(1,1,1,2,3,4,5,5,5)

  val set: Set[Int] = list.toSet

  val listOfTuple: List[(Int, Int)] = List((1, 2), (1, 3), (2, 3), (4, 5))

  val map: Map[Int, Int] = listOfTuple.toMap

  println(list)
  println(set)
  println(listOfTuple)
  println(map)
}
