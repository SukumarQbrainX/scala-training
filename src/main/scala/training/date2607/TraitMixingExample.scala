package training.date2607

trait A {

  def print(): Unit
}

trait AImpl extends A {

  abstract override def print(): Unit = {
    println("AImpl")
  }
}
