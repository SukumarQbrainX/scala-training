package training.date0908

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object FutureExample3 extends App {

  val future: Future[Int] = Future {
    println(Thread.currentThread().getName)
    Thread.sleep(2000)
    23/0
  }

  futureB.onComplete {
    case Success(value) =>
      println(">>>>>>>>>>>>>>>>>>")
      println(value)
    case Failure(exception) =>
      println("LLLLLLLLLLLLLLLLLLLLLL")
      println(exception.getMessage)
  }

  def futureB: Future[String] = future.map(_ * 2).map(_.toString)

  Thread.sleep(10000000)
}
