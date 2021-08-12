package training.date1108

import java.util.concurrent.Executors

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.{Failure, Success}

object ScalaMain3 extends App {

  implicit val ec: ExecutionContext = new ExecutionContext {

    val service = Executors.newFixedThreadPool(23)

    override def execute(runnable: Runnable): Unit = service.execute(runnable)

    override def reportFailure(cause: Throwable): Unit = {
      println("LLLLLLLLLLLLLLLLLLLLLLLLL   " + Thread.currentThread().getName)
      println(cause.getMessage)
      cause.printStackTrace()
    }
  }

  val future: Future[Int] = Future {
    throw new Exception("Asasas")
    Thread.sleep(500)
    34
  }

  println(Await.result(future, Duration.Inf))
}
