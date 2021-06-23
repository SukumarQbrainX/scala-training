package training.date23

class ScalaExample(val a: Int) {

  def + (scalaExample: ScalaExample): ScalaExample = {
    new ScalaExample(this.a + scalaExample.a)
  }
}
