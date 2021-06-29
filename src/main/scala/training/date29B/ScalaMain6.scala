package training.date29B

import java.io.PrintWriter

object ScalaMain6 extends App {

  def autoCloseable[T <: AutoCloseable, A](autoCloseable: T)
                                          (fxn: T => A): A = {
    try {
      fxn(autoCloseable)
    } finally {
      autoCloseable.close()
    }
  }

  val a: String = autoCloseable(new PrintWriter("Example.txt")) { pr =>
    val b = "Hello"
    pr.println(b)
    b
  }
}
