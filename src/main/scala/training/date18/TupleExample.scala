package training.date18

class TupleExample {

  val singleValue = 34

  val tuple: (Int, String, Boolean, Double) = (0, "Hello", true, 45.5)

  val tuple1: (Int, Runnable) = (34, new Runnable {
    override def run(): Unit = println("Hello-scala")
  })

  val tuple12: (Int, String, Boolean, Double,
    Int,String, Boolean, Double,
    Int, String, Boolean, Double,
    Int, String, Boolean, Double,
    Int, String, Boolean, Double,
    Int, String) = (0, "Hello", true, 45.5,
    0, "Hello", true, 45.5,
    0, "Hello", true, 45.5,
    0, "Hello", true, 45.5,
    0, "Hello", true, 45.5,
    0, "Hello")

  def add(a: Int, b: Int): (Int, Int) = (a + 1, b + 1)
}
