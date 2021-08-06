package training.date0608

object ThreadExample extends App {

  class RunnableImpl extends Runnable {
    override def run(): Unit = {
      Thread.sleep(100)
      println(Thread.currentThread().getName)
    }
  }

  println(Thread.currentThread().getName)
  val thread1 = new Thread(new RunnableImpl, "ABC")
  val thread2 = new Thread(new RunnableImpl, "XYZ")

  thread1.start()
  thread2.start()

  println(Runtime.getRuntime.availableProcessors())
  Thread.sleep(1000)
}
