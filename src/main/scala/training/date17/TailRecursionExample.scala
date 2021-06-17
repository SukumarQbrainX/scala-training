package training.date17

import scala.annotation.tailrec

class TailRecursionExample {

  //  @scala.annotation.tailrec
  //  final def fact(n: Int): Int = {
  //    if (n <= 1) {
  //      1
  //    } else {
  //      n * fact(n - 1)
  //    }
  //  }

  //  @tailrec
  //  final def fact(n: Int): Unit = {
  //    if (n <= 1) {
  //      println("Base condition")
  //    } else {
  //      fact(n - 1)
  //      println("Hello")
  //    }
  //  }

  @tailrec
  final def fact(n: Int, output: Int = 1): Int = {
    if (n <= 1) {
      output
    } else {
      fact(n - 1, output * n)
    }
  }
}
