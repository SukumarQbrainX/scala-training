package training.date30

import java.util
import java.util.stream.Collectors

object Main3 extends App {

  val list: util.List[Int] = util.Arrays.asList(1,2,3,4,5,6,7)

  val squareOfEvenNumber: util.List[Int] =
    Main.map(Main1.filter(list)(f => f % 2 == 0))(f => f * f)

  println(squareOfEvenNumber)

  val list1: util.List[Int] = util.Arrays.asList(1,2,3,4,5,6,7)

  val list2: util.List[Int] = list1
    .stream()
    .filter(f => f % 2 != 0)
    .map(f => f * f * f)
    .collect(Collectors.toList[Int])

  val list4: List[Int] =
    List(1,2,3,4,5).filter(f => f %2 == 0).map(f => f * f)

  val list5: List[Int] = List(1,2,3,4,5,6)
    .filter(f => f % 2 == 0)

  println(list5)

  val list6: List[Int] = List(1,2,3,4,5,6)
    .filterNot(f => f % 2 == 0)

  val list7 = List(1,2,3,4,5,6).takeWhile(f => f < 5)
  val list8 = List(12,21,33,3,4,5,11).takeWhile(f => f > 3)
  println(list6)
  println(list7)
  println(list8)

  // filterNot
  // takeWhile
}
