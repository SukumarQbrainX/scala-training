package training.date0608

import java.time.Instant
import java.util.Date

import scala.annotation.tailrec

object ThreadExample1 extends App {

  val array: List[Long] = List.fill(40000000)(9)
  var output: (Long, Int) = (0, 0)
  val numberOfThreads = 8

  val division = array.length / 4

  val thread1 = new Thread(runnable(0 * division, 1 * division))
  val thread2 = new Thread(runnable(1 * division, 2 * division))
  val thread3 = new Thread(runnable(2 * division, 3 * division))
  val thread4 = new Thread(runnable(3 * division, 4 * division))


  val timeBeforeExecution = Date.from(Instant.now())

  thread1.start()
  thread2.start()
  thread3.start()
  thread4.start()

  Thread.sleep(1000000)

  def add(list: List[Long], starting: Int, ending: Int): Long = {
    @tailrec
    def calculate(input: List[Long], output: Long = 0): Long = input match {
      case Nil => output
      case head :: tail => calculate(tail, output + head)
    }

    calculate(list.slice(starting, ending))
  }

  def runnable: (Int, Int) => Runnable = (starting: Int, ending: Int) => () => {
    updateSum(add(array, starting, ending))
  }

  def updateSum(sumOutput: Long): Unit = synchronized {
    val (prevSum, count) = output
    output = (prevSum + sumOutput, count + 1)

    if (count + 1 == numberOfThreads) {
      val timeAfterExecution = Date.from(Instant.now())
      println(timeAfterExecution.getTime - timeBeforeExecution.getTime)
      System.exit(0)
    }
  }
}
