package training.date1108

import scala.concurrent.ExecutionContext

class MyExecutionContext extends ExecutionContext {

  override def execute(runnable: Runnable): Unit = {
    println(s"Task is submitted by -> ${Thread.currentThread().getName}")
    val thread = new Thread(runnable)
    println(s"Task is submitted to -> ${thread.getName}")
    thread.start()
    println(s"Task finished submitting by -> ${Thread.currentThread().getName}")
  }

  override def reportFailure(cause: Throwable): Unit = ???
}
