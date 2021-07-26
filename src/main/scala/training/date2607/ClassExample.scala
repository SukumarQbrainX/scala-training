package training.date2607

class ClassExample {

  def add(a: Int, b: Int): Int = a + b
}

trait ClassExample1 {
  self: ClassExample =>

  override def add(a: Int, b: Int): Int = {
    println("ClassExample1")
    a + b
  }
}

trait ClassExample2 {
  self: ClassExample =>

  override def add(a: Int, b: Int): Int = {
    println("ClassExample2")
    a + b
  }
}

trait ClassExample3 extends ClassExample {
  override def add(a: Int, b: Int): Int = {
    println("ClassExample3")
    a + b
  }
}
