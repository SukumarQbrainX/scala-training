package training.date0807

class LazyValDefExample {

  val a1: Int = {
    println("val")
    23
  }

  lazy val a2: Int = {
    println("lazy val")
    24
  }

  def a3: Int = {
    println("def")
    25
  }

  def printInt(a: Int): Unit = {
    println("????????????????")
    println(a)
  }

  //??????????????
  //lazy val
  // 24

  // val
  // >>>>>>>>>>>>>>>>>>>>>
  // 23
  // lazy val
  // 24
  // def
  // 25
  // >>>>>>
  // >>>>>>
  // 23
  // 24
  // def
  // 25
  // >>>>

  //  val lazyValDefExample = new LazyValDefExample

  //  println(">>>>>>>>>>>>>>>>>>>>")
  //  println(lazyValDefExample.a1)
  //  println(lazyValDefExample.a2)
  //  println(lazyValDefExample.a3)
  //  println(">>>>>>>>>>>>>>>>>>>>")
  //
  //  println(">>>>>>>>>>>>>>>>>>>>")
  //  println(lazyValDefExample.a1)
  //  println(lazyValDefExample.a2)
  //  println(lazyValDefExample.a3)
  //  println(">>>>>>>>>>>>>>>>>>>>")
}
