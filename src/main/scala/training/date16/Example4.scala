package training.date16

class Example4 {

  // Default Argument values
  def sayName(fName: String, lName: String, rollNumber: Int = 1234): String =
    s"""
       |{
       |  "fName": "$fName",
       |  "lName": "$lName",
       |  "rollNumber": $rollNumber
       |}
       |""".stripMargin

  def sayName1(fName: String, lName: String = "LName", rollNumber: Int): String =
    s"""
       |{
       |  "fName": "$fName",
       |  "lName": "$lName",
       |  "rollNumber": $rollNumber
       |}
       |""".stripMargin

  def sayName2(fName: String, lName: String = "LName", rollNumber: Int = 1234): String =
    s"""
       |{
       |  "fName": "$fName",
       |  "lName": "$lName",
       |  "rollNumber": $rollNumber
       |}
       |""".stripMargin
}
