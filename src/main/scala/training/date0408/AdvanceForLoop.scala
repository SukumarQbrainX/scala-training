package training.date0408

object AdvanceForLoop extends App {

  val list = List(1,2,3,4)

  val list2 = for {
    elemt <- list
  } yield elemt * 2

  val list3: List[Int] = list.map(_ * 2)

  println(list)
  println(list2)
  println(list3)

  val list4 = List("scala", "java")

  val list5: List[(Int, String)] = for {
    elemt <- list
    elemt1 <- list4
  } yield (elemt, elemt1)

  val list6: List[(Int, String)] = list.flatMap(ele => list4.map(ele1 => (ele, ele1)))

  val list7 = List("Hello", "World")

  val list8: List[(Int, String, String)] = for {
    elemt <- list
    elemt1 <- list4
    elemt2 <- list7
  } yield (elemt, elemt1, elemt2)

  val list9 = list.flatMap(ele => list4.flatMap(ele1 => list7.map(ele2 => (ele, ele1, ele2))))

  println(list5)
  println(list6)

  println(list8)
  println(list9)

  val a: Unit = for {
    elemt <- list
    elemt1 <- list4
    elemt2 <- list7
  } {
    println(elemt, elemt1, elemt2)
  }

  val b: Unit = list.flatMap(ele => list4.flatMap(ele1 => list7.map(ele2 => (ele, ele1, ele2)))).foreach(println)


  val optionA = Option(12)

  val output = for {
    ele <- optionA
  } yield ele + 2

  val output1: Option[Int] = optionA.map(_ + 2)

  println(output)
  println(output1)

  val output2: Option[(Int, Int)] = for {
    ele <- optionA
    ele1 <- Option(23)
  } yield (ele, ele1)

  println(optionA.flatMap(ele => Option(23).map(ele1 => (ele, ele1))))

  val list10 = List(1,2,3,4)

  val list11 = for {
    ele <- list10
    if ele % 2 == 0
  } yield ele * 2

  println(list11)

  val filter = list10.filter(_ % 2 == 0).map(_ * 2)

  println(filter)

}
