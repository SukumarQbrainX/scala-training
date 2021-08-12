package training.date1108

import java.util.concurrent.CompletionStage

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global

object ScalaMain4 extends App {

  val promise = Promise[Int]()


  promise.future.onComplete(println)


  val future: Future[Int] = Future.successful(23)
  val future1: Future[Int] = Future.failed(new Exception("Asas"))

  import scala.jdk.FutureConverters._

  val java: CompletionStage[Int] = future.asJava

  val scalaa: Future[Int] = java.asScala

  promise.failure(new Exception("Sas"))

  Thread.sleep(100000)
}
