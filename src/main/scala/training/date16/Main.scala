package training.date16

object Main {

  def main(args: Array[String]): Unit = {
    val example = new Example
    val example1 = new Example

    example.print()

    val a = example add(1, 8)

    val b = example.add(23,33)

    println(a)
    println(b)

    println(example + example1)

    // Scala Is pure Object Oriented Language



    val str = "Hello" + "  " +"Java"
    val str1 = "Hell1".concat(" ").concat("Java")

    val str2 = s"$str  is a string $str1 cont ${str.charAt(0)}"

    val str3 = " \"Hello\" "

    val str4 = s""" "Hello" ${1 + 1} """

    val str5 =
      s"""
        |{
                                    |   "name": "Divyanshu",
        |   "Id": ${1+ 2}
        |}
        |""".stripMargin

    val str6 = "{\n    \"name\": \"Divyanshu\"\n}"

    println(str)
    println(str1)
    println(str2)
    println(str3)
    println(str4)
    println(str5)
    println(str6)
  }
}
