package training.date29

object ScalaMain extends App {

  val javaFunctionalInterface = new JavaFunctionalInterface {
    override def add(a: Int, b: Int): Int = a + b
  }

  println(javaFunctionalInterface.add(1, 2))

  val javaFunctionalInterface1: JavaFunctionalInterface = (a, b) => a + b

  println(javaFunctionalInterface.add(1,2))
}
