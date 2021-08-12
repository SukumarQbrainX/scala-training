package training.date0908

object ThreadExample2 extends App {

  println(Thread.currentThread().getName)

  try {
    new Thread(() => {
      println(Thread.currentThread().getName)
      throw new Exception(s"Excpetion From ${Thread.currentThread().getName}")
    }).start()
  } catch {
    case ex => println(ex)
  }
//  throw new Exception(s"Excpetion From ${Thread.currentThread().getName}")

  println("Hello")

}
