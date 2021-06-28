package training.date28B

import java.util.Scanner

object SideEffectsFunctions extends App {

  println("Asas")

  var i = 0

  def f(x: Int) = {
    i += x
  }

  def g(x: Int) = {
    x + 1
  }

  def f1(x: Int): Int = ???

  def f2(x: Int): Unit = ???

  println(f1(1))
}
