package training.date0807

class AnonExample extends App {

  def map[A, B](input: A)(mapperFxn: A => B): B = mapperFxn(input)

  def intToDouble(input: Int): Double = input.toDouble

  println(map(12)(intToDouble))
  println(map(21)(f => f.toString))

  def run(runnable: Runnable): Unit = runnable.run()

  run(new Runnable {
    override def run(): Unit = println("SAdad")
  })

  run(() => println("fsdfsdf"))
}
