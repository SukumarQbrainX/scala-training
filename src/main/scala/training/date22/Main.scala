package training.date22

object Main extends App {

  val scalaTrait1: ScalaTrait1 = new ScalaTrait1Impl1

  val scalaTrait2: ScalaTrait2 = new ScalaTrait1Impl1

  JavaInterOpInterface.print()
  ScalaInterOpInterface.print()

  val scalaTrait1A: ScalaTrait1 = new ScalaTrait1 {
    override def print(): Unit = ???
  }

  val javaInterfaces1: JavaInterfaces1 = new JavaInterfaces1 {
    override def add(a: Int, b: Int): Double = ???
  }
}
