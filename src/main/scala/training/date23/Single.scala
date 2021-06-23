package training.date23

class Single {

  def increment(a: Int): Int = {
    println("Single")
    a + 1
  }
}

class SingleChild extends Single {

  override def increment(a: Int): Int = {
    println("SingleChild")
    a + 1
  }
}
