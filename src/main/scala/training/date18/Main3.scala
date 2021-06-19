package training.date18

object Main3 {

  def main(args: Array[String]): Unit = {

    val defExample = new DefExample

    println(defExample.add(23))

    println(defExample.add(1,2,2,2,2,2))

    println(defExample.variable)

    val defExample1 = new DefExample1

    println(defExample1.four)

    println(defExample1.five)
    println(defExample1.five())

    defExample1.printSomething(12)

    val ret: Unit = defExample1.printSomething(23)

    println(defExample1.printSomething(34))
    println(ret.toString)

//    println(defExample.internalAdd())
  }
}
