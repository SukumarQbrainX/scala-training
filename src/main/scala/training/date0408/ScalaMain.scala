package training.date0408

object ScalaMain extends App {

  val list = List[Int]()

  println(list.isEmpty)

  val list1: List[Int] = Nil

  println(list1.isEmpty)

  val optionList: List[Int] = Option(List(1,2,3,4,5)).getOrElse(Nil)

  val list2 = ::(1, Nil)

  println(list2)

  val list3 = ::(2, list2)

  println(list3)

  val list4 = ::(3, list3)

  println(list4)


  val list6 = ::(4, ::(3, ::(2, :: (1, Nil))))
  val list5 = 4 :: (3 :: (2 :: (1 :: Nil)))

  println(list5)

  val ::(head, tail) = list5

  println(head, tail)

  val head1 :: head2 :: head3 :: head4 :: Nil = list5

  println(head1, head2, head3, head4)

}
