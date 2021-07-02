package training.date0207

class ScalaExample private {

  def apply(a: Int): String = s"Int to string -> $a"
}

object ScalaExample {

  def apply(): ScalaExample = new ScalaExample

  def apply[X]: String = "Asas"
}
