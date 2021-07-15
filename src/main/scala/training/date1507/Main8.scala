package training.date1507

object Main8 extends App {

  val a = (12, true)

  a match {
    case x => println(x.isInstanceOf[(Int, Boolean)])
  }

  a match {
    case (int, bool) => println(int)
      println(bool)
  }

  val b: ((String, Int), Double) = (("Hello", 23), 233.3)

  b match {
    case x @ ((string, int), bool) =>
      println(string)
      println(int)
      println(bool)
      println(x.toString())
  }
}
