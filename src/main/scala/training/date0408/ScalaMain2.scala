package training.date0408

object ScalaMain2 extends App {


  final class My[A](element: A) {

    def map[B](fxn: A => B): B = {
      println("Map is called")
      fxn(element)
    }

    def flatMap[B](fxn: A => My[B]): My[B] = {
      println("Flat Map is called")
      fxn(element)
    }
  }

  val my1 = new My[Int](12)
  val my2 = new My[String]("Hello")

  val output: Int = for {
    ele <- my1
  } yield ele + 1

  println(output)
  println(my1.map(_ + 1))
}
