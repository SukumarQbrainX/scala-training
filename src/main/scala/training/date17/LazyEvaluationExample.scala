package training.date17

class LazyEvaluationExample {

  lazy val variable: Int = {
    println("LAZY")
    34
  }

  lazy val variable1: EagerEvaluationExample = {
    println("LAZY1")
    new EagerEvaluationExample
  }

  def add(a: Int): Int = {
    println("Lazy not working")
    a + 1
  }
}
