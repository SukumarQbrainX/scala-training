package training.date0807

class ApplyExample private(private val variable: Int, private val variable1: String) {

  private val a: Double = 23.0

  def apply(): Int = variable
}

object ApplyExample {

  def apply(input: Int)(str: String): ApplyExample =
    new ApplyExample(23, str)

  def apply(input: Int, str: String, a: Boolean): ApplyExample =
    new ApplyExample(23, str)

  def unapply(applyExample: ApplyExample): Option[(Double, String)]=
    Option((applyExample.a, applyExample.variable1))
}
