package training.date30B

object Main1 extends App {

  println(findLength(Option.apply("Jjjjjj")))
  println(findLength(Option.apply(null)))
  println(findLength(Some.apply("asjdlkajsdljalsjd")))
  println(findLength(None))

  def findLength(option: Option[String]) = {
    if(option.nonEmpty) {
      option.get.length
    } else {
      0
    }
  }
}
