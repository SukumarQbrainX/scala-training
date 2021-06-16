package training.date16

object Main1 {

  def main(args: Array[String]): Unit = {

    val example3 = new Example3

    println(example3.add(1,2))

    println(example3.varargs(1,1,1,1,1))
    println(example3.varargs())
    println(example3.varargs(1))

    val example4 = new Example4

    println(example4.sayName("Divyanshu", "Srivastava", 13234))
    println(example4.sayName(fName = "Test", lName = "Test1", rollNumber = 12345))
    println(example4.sayName(rollNumber = 122222, fName = "Test2", lName = "asasasas"))
    println(example4.sayName(fName = "Test3", "asas", 123456))
    println(example4.sayName("Test4", lName = "sasasas", 1235))

    println(example4.sayName("First", "Second"))

    println(example4.sayName("First", "Test",122))

    println(example4.sayName2("First"))
    println(example4.sayName2("First", "test"))
    println(example4.sayName2("First", "test", 123445))

    println(example4.sayName1("Test1", rollNumber = 234567)) // Named Arguments
    println(example4.sayName1("Test5", "Test3", rollNumber = 2345617)) // Named Arguments
  }
}
