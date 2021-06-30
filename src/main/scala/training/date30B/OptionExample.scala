package training.date30B

object OptionExample extends App {

  val stringOption: Option[String] = None
  val stringOption1: Option[String] = Some.apply("shdkjasjd")
  val stringOption2: Option[String] = Option.apply("Asasdasd")
  val stringOption3: Option[String] = Option.apply(null)

  println(stringOption3 == stringOption)

  val stringOption4: Some[String] = Some.apply("Sdasd")
//  val stringOption5: Some[String] = Some.apply(null) some should not contain any null values

  val stringNumberOption: Option[String] = Option.apply("545")
  val intOption: Option[Integer] = stringNumberOption.map(f => Integer.parseInt(f))

  println(">>>>" + intOption)

  Option.apply("null")
    .foreach(f => println(s"Hello $f"))

  val stringOutput: String = stringNumberOption.getOrElse("Default")
  val stringOutput1: String = stringNumberOption.orNull
//  val stringOutput3: String = stringNumberOption.getOrElse(throw new Exception("ASdad"))

  println(stringOutput)
  println(stringOutput1 == null)

  println("<>>>>>>>>>>>>>>")
  for (i <- stringNumberOption) {
    val a: String  = i
    println(i)
  }

//  println(stringOption5)
}
