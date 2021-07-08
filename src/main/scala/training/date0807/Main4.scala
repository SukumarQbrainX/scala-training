package training.date0807

object Main4 extends App {

  def extractIntOrZero(input: Option[Int]): Int =
    input match {
      case Some(value) => value
      case None => 0
    }

  println(extractIntOrZero(Some(2323)))
}
