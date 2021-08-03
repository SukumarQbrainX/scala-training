package training.date0308

object ScalaMain extends App {

  val list = List(1, 2, 3, 4, 5)
  val str = "Hello"

  // head, tail, last
  println(list.head)
  println(str.head)

  val list1: List[Int] = list.tail
  val str1: String = str.tail

  println(list1)
  println(str1)

  println(list.tail.head)

  println(list.last)
  println(str.last)

  // nonEmpty && isEmpty

  println(list.isEmpty) // false
  println(list.nonEmpty) // true

  println(List.empty.isEmpty) // true
  println(List.empty.nonEmpty) // false

  println("".isEmpty) // true
  println("".nonEmpty) // false

  println(str1.nonEmpty) // true
  println(str1.isEmpty) // false

  // getting element

  println(list(2))
  //  println(list(7))

  println(list.headOption)

  println(List.empty.headOption)

  List.empty.headOption match {
    case Some(value) =>
      println(value)
    case None =>
      println("No value")
  }

  // map

  val list2: List[Int] = list.map(_ * 2)

  println(list2)

  /**
   * 1  2
   * 3  4
   */
  val list3: List[List[Int]] = List(List(1, 2), List(3, 4))
  val list4: List[Int] = list3.flatten
  val list5: List[String] = List("Java", "Scala")
  val list6: List[Char] = list5.flatten

  println(list3)
  println(list4)

  println(list6)

  // flatMap

  val list7 = List(1, 2, 3, 4, 5, 6, 7)

  val list8: List[String] = list7.flatMap(f => List.fill(f)(s"Scala - $f"))

  val list9: List[List[String]] = list7.map(f => List.fill(f)(s"Scala - $f"))
  val list10: List[String] = list9.flatten


  println(list9)
  println(list8)
  println(list10)

  // filter

  val list11 = list7.filter(_ % 2 == 0)
  val list12 = list7.filter(f => !(f % 2 == 0))
  val x = list7.filterNot(_ % 2 == 0)

  println("<<<<<")
  println(list11)
  println(list12)
  println(x)


  // find

  val element4: Option[Int] = list7.find(_ == 40)

  element4 match {
    case Some(value) =>
      println(value)
    case None =>
      println("No element")
  }

  // slice

  val list13 = list7.slice(0, 4)

  println(list13)
}
