package training.date17

import scala.annotation.tailrec

class RecursionExample {

  def fxn(a: Int): Unit = {
    if (a == 1) {
      println("Base Condition reached")
    } else {
      fxn(a - 1)
    }
  }

  @tailrec
  final def fxn1(a: Int): Unit = {
    if (a == 1) {
      println("Base Condition reached")
    } else {
      fxn1(a - 1)
    }
  }
}
