package training.date18

object Main extends App {

  val tupleExample = new TupleExample

  println(tupleExample.tuple)

  println(tupleExample.tuple._2)

  println(tupleExample.tuple._3)

  tupleExample.tuple1._2.run()

  println(tupleExample.tuple._1)

  println(tupleExample.add(1,2)._1)

  println(tupleExample.tuple12._22.charAt(0))

  val list: List[(Int, Int)] = List((1,3), (4,5))

  println(list)

  val map: Map[Int, Int] = list.toMap

  println(map)

  val list1: List[(Int, Int)] = map.toList

  println(list1)

//  Main4.printStatus(23)

  Main4.add(1,2)
}
