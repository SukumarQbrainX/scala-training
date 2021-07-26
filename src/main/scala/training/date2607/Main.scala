package training.date2607

object Main extends App {

  val example: Example = new ExampleImpl
  val example1: Example = new ExampleImpl1

  println(example.increment(23))
  println(example1.increment(23))


  val example2: Example = new Example {
    override def add(a: Int, b: Int): Int = {
      println("overriding")
      a + b
    }
  }

  val example3 = new Example with Example2 with Example1 with Example3

  println(">>>>>>>>>>>>>>>>>")

  println(example2.increment(23))
  println(example3.increment(23))
  println(">>>>>>>>>>>>>>>>>")

  val example4: Example3 = new ExampleImpl2

  val example5: Example = example4

  println(example4.increment(12))
  println(example5.increment(12))

  val example6: Example = (a, b) => a + b


  val example7 = new ExampleImpl4
}
