package training.date1507

object Main9 extends App {

  def optionIntToString(optionInt: Option[Int]): String =
    optionInt match {
    case Some(value) => value.toString
    case None => "No Value"
  }

  println(optionIntToString(None))
  println(optionIntToString(Some(12)))
}
