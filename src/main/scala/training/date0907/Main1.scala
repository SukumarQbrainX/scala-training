package training.date0907

object Main1 extends App {

  val tuple: (Int, Boolean) = (1, true)

  val tuple1: Tuple2[Int, Boolean] = new Tuple2[Int, Boolean](1, true)

  println(tuple.isInstanceOf[Tuple2[Int, Boolean]])
  println(tuple1.isInstanceOf[Tuple2[Int, Boolean]])
}
