package training.date0207

object Main extends App {

  try {
    val a = 1 / 0
  } catch {
    case ex: ArithmeticException =>
      ex.printStackTrace()
    case ex: NullPointerException =>
      ex.printStackTrace()
    case exception: Exception =>
      exception.printStackTrace()
  } finally {

  }
}
