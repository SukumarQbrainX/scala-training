package training.date1108

import scala.concurrent.{ExecutionContext, Future}


object Main extends App {

  implicit val ec: ExecutionContext = ParasiticExecutionContext

  case class A(a: String)

  val a: Future[A] = Future("jeee")(ExecutionContext.global).map(A)(ExecutionContext.parasitic)

  println(Thread.currentThread().getName)

  Future {
    println(Thread.currentThread().getName)
  }


  Future {
    println(Thread.currentThread().getName)
  }


  Future {
    println(Thread.currentThread().getName)
  }


  Future {
    println(Thread.currentThread().getName)
  }

  println(Thread.currentThread().getName)

}
