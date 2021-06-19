package training.date18

object Main4 {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  val a: Int = 23

  lazy val b: Int = {
    println("lazy")
    34
  }

  // If Else
  def printStatus(a: Int): Unit = {
    if (a > 0) {
      println("positive")
    } else if (a == 0) {
      println("ZERO")
    } else {
      println("negative")
    }
  }

  // cond ? ss : eee
  def printStatus1(a: Int): Unit = {
    val result = if (a >= 0) "Positive" else "Negative"
    val result1 = if (a > 0) "Positive" else if (a == 0) "Zero" else "Negative"
    println(result)
    println(result1)
  }

  // While loop
  def printLoop(a: Int): Unit = {
    var i = 0
    while (i <= a) {
      println("Loop")
      i.+=(1)
    }
  }

  // for loop
  def printLoop1(a: Int): Unit = {
    for (i <- 1 to a by 2) {
      println(i)
    }
    println(">>>>>>>>>")
    for (i <- a to 1 by -1) {
      println(i)
    }
    println(">>>>>>>>>")
    for (i <- 1 until a) {
      println(i)
    }
  }

  def printLoop2(a: Int*): Unit = {
    for (i <- a) {
      println(i)
    }

    for (i <- 0 until a.length) {
      println(a(i))
    }
  }

  // do while
  def printLoop3(a: Int): Unit = {
    var i = 0
    do {
      println("Loop")
      i += 1
    } while (i <= a)
  }

  def main(args: Array[String]): Unit = {

    println(add(3, 4))
    println(b)

    printStatus(34)

    printStatus1(111)
    printLoop(2)

    printLoop(3)

    printLoop1(9)

    printLoop2(1,4,3,5,6)

    for (i <- "Hello") {
      println(i)
    }

    printLoop3(34)
  }
}
