package training.date29B

object ScalaMain5 extends App {

  def add(fxn: Int => String): String = fxn(1)

  def add(fxn: (Int, Int) => String): String = fxn(1, 2)

  def add(fxn: => String): String = fxn

  def example(): String = "hello"

  def example1: String = "hello"

  add(a => s"$a")
  add((a, b) => s"$a - $b")
  add(example)
  add(example1)

  add(_ => "Hello")

  add { (a, b) =>
    println("ASdasdasdad")
    s"$a + $b"
  }

  add((a, b) => {
    println("ASdasdasdad")
    s"$a + $b"
  })
}
