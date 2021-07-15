package training.date1507

object PMExample1 extends App {

  val a = 69

  a match {
    case 1 => println("One")
    case 2 => println("Two")
    case 3 => println("Three")
    case _ => println("Default")
  }

  a match {
    case x if x % 2 == 0 => println(s"$x is Divisible by 2")
    case x if x % 3 == 0 => println(s"$x is Divisible by 3")
    case x => println(s"Default $x")
  }

  val b: Int = a match {
    case xasdasdsdf if xasdasdsdf % 2 == 0 => xasdasdsdf / 2
    case x if x % 3 == 0 => x / 3
    case x => x
  }

  println(b)

  false match {
    case true => println("true")
    case false => println("false")
  }

  def condition(x: Int): Boolean = x % 2 == 0

  a match {
    case _ if condition(a) => println(s"$a is divisible by 2")
    case _ => println(s"$a is default case")
  }

  val c = "Hello"

  c match {
    case "Hello" => println("Hewerwer")
    case "World" => println("SDsdfdf")
    case _ => println("default-case")
  }

  a match {
    case x =>
      if (x > 0) {

      } else if (x == 0) {

      }
  }

  a match {
    case x if x > 0 =>
    case x if x == 0 =>
    case x if x < 0 =>
  }
}
