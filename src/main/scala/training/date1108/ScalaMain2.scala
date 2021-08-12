package training.date1108

import scala.concurrent.Future

object ScalaMain2 extends App {

  val ec = new MyExecutionContext

  val a = Future {
    println(Thread.currentThread().getName)
    23
  }(ec).map(f => {
    println("BFuture")
    println(Thread.currentThread().getName)
    f.toString
  })(ec)

  val b = Future {
    println(Thread.currentThread().getName)
    23
  }(ec).map(f => {
    println("AFuture")
    println(Thread.currentThread().getName)
    f.toString
  })(ec)

  println("LLLLLLLLLLLLLL")
}
