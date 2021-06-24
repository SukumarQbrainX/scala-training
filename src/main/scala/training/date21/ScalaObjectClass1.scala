package training.date21

object ScalaObjectClass1 extends Runnable {

  def printHelloWorld(): Unit = println("Hello World")

  override def run(): Unit = printHelloWorld()
}
