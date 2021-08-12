package training.date1108

import scala.concurrent.{ExecutionContext, Future}

object ScalaMain extends App {

  val ec: ExecutionContext = new MyExecutionContext

  println(Thread.currentThread().getName + "}{}{}}{")

  val future: Future[String] = Future {
    println(Thread.sleep(500))
    println(Thread.currentThread().getName)
    23
  }(ec).map(_.toString)(ec)

  println(">>>>>>>>>>>>>>>>>>>   " + future)

  Thread.sleep(2000)

  println(">>>>>>>>>>>>>>>>>{{{{{{{{{{{{{>>   " + future)
}
