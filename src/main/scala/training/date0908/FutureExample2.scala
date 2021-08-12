package training.date0908

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object FutureExample2 extends App {

  val future1: Future[Int] = Future(23)

  println(future1)
}
