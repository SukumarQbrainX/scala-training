package training.date28B

import scala.util.Random

object PureAndImpureFunctions extends App {

  def f(x: Int): Int = x + 10

  def rand(x: Int): Int = new Random().nextInt(x)

  def g(x: Int): Int = x + rand(10)

  for(i <- 1 to 5) {
    println(f(1))
  }

  for(i <- 1 to 5) {
    println(g(1))
  }
}
