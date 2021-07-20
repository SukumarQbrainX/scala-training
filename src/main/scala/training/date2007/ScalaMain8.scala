package training.date2007

object ScalaMain8 extends App {

  implicit val a = 23

  def add(implicit a: Int, b: Boolean) = s"$a, $b"

  val a1: String = add(implicitly[Int], true)

  println(a1.isInstanceOf[String])
}
