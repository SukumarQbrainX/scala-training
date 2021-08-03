package training.date0308

import scala.util.Random

object ScalaMain4 extends App {

  case class Student(name: String, uid: Int, rollNumber: Int)

  implicit val studentComparator: Ordering[Student] = (x, y) => x.rollNumber - y.rollNumber

  val list: List[Student] = List.tabulate(6)(index => Student(s"Name -> $index",
    new Random().nextInt(60) + index, new Random().nextInt(60) + index))

  list.foreach(student => {
    println(student)
  })

  val list1 = list.sortBy(_.uid)
  println(">>>>>>>>>>>>>>>>>>>>")
  list1.foreach(student => {
    println(student)
  })

  val list2 = list.sortWith((f, g) => f.rollNumber <= g.rollNumber)

  println(">>>>>>>>>>>>>>>>>>>>")
  list2.foreach(student => {
    println(student)
  })

  val list3 = list.sorted

  println(list3)

  val list4 = List(2, 4, 7, 4, 8, 1)
  println(">>>>>>>>>>>>>>>>>>>>")

  list4.sorted.foreach(println)


  val list5: List[List[Int]] = list4.permutations.toList

  list5.foreach(println)
}

