package training.date21

object Main {

  def main(args: Array[String]): Unit = {

    val class1 = new Class1("Hello", 34)
    val class1A = new Class1("Hedasd")
    val class1B = new Class1(rollNumber = 1222, name = "Sadasd")
    val class1C = new Class1("Asas")

    class1.printName()
    class1A.printName()
    class1B.printName()

    class1A.add(1, 2)

    println(class1.name)
    println(class1.rollNumber)

    println(class1C.address)
    class1C.address = "Asasa"
    println(class1C.address)

    val javaClass1 = new JavaClass1("adsasd")
  }
}
