package training.date21

class Class1(val name: String,
             val rollNumber: Int = 11,
             var address: String = "No") {

  def this() {
    this("sasa", 11, "Yes")
  }

  def this(name: String) {
    this(name, rollNumber = 223)
  }

  if (name.isEmpty) {
    throw new Exception("Empty Name")
  }

  val x = 3232

  def add(a: Int, b: Int): Int = ???

  println("asasdasdsad")

  def printName(): Unit = println(name)

  println("Hasdssdfsdfsdf -1 123123123")
}
