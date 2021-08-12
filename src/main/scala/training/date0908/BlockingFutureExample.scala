package training.date0908

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.FiniteDuration
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Success}

object BlockingFutureExample extends App {

  println(">>>>>>>>>>>>>>>>>" + Thread.currentThread().getName)

  val future: Future[Int] = Future {
    println(Thread.currentThread().getName)
    Thread.sleep(20000)
    25 / 0
  }

  println(future.isCompleted)

  //  val result: Int = Await.result(future, FiniteDuration(4, "seconds"))

  val result: Future[Int] = Await.ready(future, FiniteDuration(400, "seconds"))

  println(result.isCompleted)
  println(future.isCompleted)

  result.value match {
    case None => println("Future is not completed yet.")
    case Some(Success(value: Int)) => println(value)
    case Some(Failure(exception)) =>
      println(s"Exception Occured => ${exception.getMessage}")
//      exception.printStackTrace()
  }

  println(">>>>>>>>>>><<<<<<<<<<<<")
}
