package training.date0908

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

object FutureExample1 extends App {

  val ec: ExecutionContext = ExecutionContext.global

  println(Thread.currentThread().getName)

  val futureInt: Future[Int] = Future {
    println(Thread.currentThread().getName)
    Thread.sleep(100)
    23 / 0
  }(ec)

  printFuture(futureInt)

  println(">>>>>>>>>>>>>>>>>>>>>>>")

  Thread.sleep(1000)

  printFuture(futureInt)

  def printFuture[T](futureInput: Future[T]): Unit = futureInput.value match {
    case None => println("Future is not completed yet.")
    case Some(Success(value: Int)) => println(value)
    case Some(Failure(exception)) =>
      println(s"Exception Occured => ${exception.getMessage}")
      exception.printStackTrace()
  }
}
