package training.date0807

object Main2 extends App {

  val applyExample: ApplyExample = ApplyExample(23)("Sdasd")
  val applyExample1: ApplyExample = ApplyExample.apply(23)("Sdasd")

  val a1: Int = applyExample()

  val a2: Int = applyExample.apply()

  val a3: Int = ApplyExample(23)("Sdasd")()

  val a4: ApplyExample = ApplyExample.apply(12)("Sdasd")
  val a5: Int = a4.apply()

  val a6 = ApplyExample.apply(12)("Sdasd").apply()
  val a7 = ApplyExample(12)("Sdasd")()
}
