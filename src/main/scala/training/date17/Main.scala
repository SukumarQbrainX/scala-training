package training.date17

object Main {

  def main(args: Array[String]): Unit = {

    val example1 = new EagerEvaluationExample
    val lazyEvaluationExample = new LazyEvaluationExample

    println(example1.variable)
    println(example1.variable)
    println(example1.variable)

    println(lazyEvaluationExample.add(lazyEvaluationExample.variable))

    println(lazyEvaluationExample.variable)

    println(lazyEvaluationExample.variable)
    println(lazyEvaluationExample.variable)
    println(lazyEvaluationExample.variable)

    println(lazyEvaluationExample.variable1)

    println(lazyEvaluationExample.variable1)
  }
}
