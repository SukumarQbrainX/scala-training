package training.date21

class ScalaStudent private (private val name: String) {

  def getUniversity: String = ScalaStudent.UNIVERSITY

  def checkInstanceEquality(scalaStudent: ScalaStudent): Boolean = {
    ScalaStudent.checkEquality(scalaStudent, this)
  }
}

// This should be present in the same file
// The name of companion object should be same as class Name

object ScalaStudent {

  private val UNIVERSITY: String = "Asadasd"

  def newInstance(name: String): ScalaStudent =
    new ScalaStudent(name)

  private def checkEquality(scalaStudent: ScalaStudent, scalaStudent1: ScalaStudent): Boolean = {
    scalaStudent equals scalaStudent1
  }

  def printName(scalaStudent: ScalaStudent): Unit = {
    println(scalaStudent.name)
  }
}
