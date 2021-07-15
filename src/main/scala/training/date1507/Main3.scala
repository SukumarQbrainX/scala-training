package training.date1507

object Main3 extends App {

  sealed trait Example {

    def name: String
  }

  final case class ExampleTrait(override val name: String) extends Example

  final class ExampleTraitNormalClass(override val name: String) extends Example

  object ExampleTraitNormalClass {

    def unapply(exampleTraitNormalClass: ExampleTraitNormalClass): Option[String] =
      Option(exampleTraitNormalClass.name)
  }

  def example(ex: Example): Unit = ex match {
    case x @ ExampleTrait(name) =>
      println(name)
      println(x)
      println(x.name)
    case x @ ExampleTraitNormalClass(str) => println(str)
      println(x)
  }

  example(ExampleTrait("@1212"))
}
