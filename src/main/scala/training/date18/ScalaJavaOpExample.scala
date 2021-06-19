package training.date18

import java.time.Instant
import java.util
import java.util.Date

import training.date18.Student

class ScalaJavaOpExample {

  val javaList: util.LinkedList[Integer] =
    new util.LinkedList[Integer]

  val javaMap =
    new util.HashMap[Integer, String]

  val date: Instant = Instant.now()

  def max(a: Int, b: Int): Int =
    Math.max(a, b)

  val student: Student =
    new Student("Hello", 123322)

  val date1 = new Date
}
