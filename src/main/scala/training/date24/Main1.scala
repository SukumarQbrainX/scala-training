package training.date24

import Student._

object Main1 extends App {

  val student = newInstance("ASdasd", 2323)

  import java.util.Map
  import java.util


  val map: Map[String, Int] = new util.HashMap[String, Int]()

  student.printStudentData()

  student.equals(null)

  import student._

  printStudentData()

  newInstance("sadasd", 12)
  newInstance("dasdas", 1212)
}
