package training.date30

import java.util

object Main1 extends App {

  def filter[A](inputList: util.List[A])
               (fxn: A => Boolean): util.List[A] = {
    val list = new util.LinkedList[A]()
    for (i <- 0 until inputList.size()) {
      val element = inputList.get(i)
      if (fxn(element)) {
        list.add(element)
      }
    }
    list
  }

  val list: util.List[Int] = util.Arrays.asList(1,2,3,4,5,6)

  val evenNumberList: util.List[Int] = filter(list)(f => f % 2 == 0)

  val oddNumberFilter = filter(list)(f => f % 2 != 0)

  println(list)
  println(evenNumberList)
  println(oddNumberFilter)

  val list1: util.List[String] = util.Arrays.asList("Scala", "Java", "C", "C++", "C#")

  val languageStartingWithCharC: util.List[String] =
    filter(list1)(f => f.startsWith("C"))

  val programmingLanguageNameOfSizeFour = filter(list1)(f => f.length == 4)

  println(list1)
  println(languageStartingWithCharC)
  println(programmingLanguageNameOfSizeFour)
}
