package training.date18

import scala.annotation.tailrec

class DefExample {

  def add(a: Int): Int = {

    def internalAdd(b: Int): Int = a + b

    def internalAdd1(b: Int): Int = a + b


    internalAdd(internalAdd1(23))
  }

  def add(arg: Int*): Int = {

    @tailrec
    def addTailRec(index: Int, sum: Int): Int = {
      if (index >= arg.length) {
        sum
      } else {
        addTailRec(index + 1, sum + arg(index))
      }
    }

    addTailRec(0, 0)
  }

  val variable: Int = {
    def add(a: Int): Int = a + 1
    add(12)
  }
}
