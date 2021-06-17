package training.date17

import scala.annotation.tailrec

class RecursionExample1 {

  def fxn(a: Int): Unit = {
    if (a == 1) {
     throw new Exception("Non Tail Recursive")
    } else {
      fxn(a - 1)
    }
  }

  @tailrec
  final def fxn1(a: Int): Unit = {
    if (a == 1) {
      throw new Exception("Tail Recursive")
    } else {
      fxn1(a - 1)
    }
  }
}
