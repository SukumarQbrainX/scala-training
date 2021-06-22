package training.date22

class ScalaClassExampl2(private val name: String,
                        var rollNumber: Int,
                        address: String)
{

  def compare(scalaClassExampl2: ScalaClassExampl2): Boolean = {
    scalaClassExampl2.name == this.name
//    scalaClassExampl2.address == this.address
  }

  override def toString: String =
    s"""
       |{
       |  $name   $rollNumber    $address
       |
       |
       |}
       |
       |""".stripMargin
}

object ScalaClassExampl2 {

  def printName(scalaClassExampl2: ScalaClassExampl2): Unit = {
    println(scalaClassExampl2.name)
  }
}
