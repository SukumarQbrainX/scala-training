package training.date22

object Main2 extends App {

  trait Calculator {

    def getClassName: String

    def add(a: Int, b: Int): Int
  }

  class CalculatorExample1 extends Calculator {
    override def add(a: Int, b: Int): Int = {
      a +  b
    }

    override def getClassName: String =  {
      println("CalculatorExample1 - ddddddd")
      "sdasdasd"
    }
  }

  class CalculatorExample2 extends Calculator {
    override def add(a: Int, b: Int): Int = {
      a +  b
    }

    override val getClassName: String =  {
      println("CalculatorExample2 - deffffff")
      "CalculatorExample2"
    }
  }


  val a: Calculator = new CalculatorExample1
  val b: Calculator = new CalculatorExample2

  println(a.getClassName)
  println(a.getClassName)

  println(b.getClassName)
  println(b.getClassName)
}
