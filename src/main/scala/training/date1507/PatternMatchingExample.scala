package training.date1507

object PatternMatchingExample extends App {

  def sayHello(gender: Char, name: String): Unit = gender match {
    case 'M' =>
      println(s"Hello Mr. $name")
      println("multiline")
    case 'F' => {
      println(s"Hello Mrs. $name")
      println("multiline")
    }
    case x => println(s"Hello $x $name")
      println("multiline")
  }

  sayHello('M', "asdajsd")
}
