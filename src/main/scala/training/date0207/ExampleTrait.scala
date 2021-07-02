package training.date0207

trait ExampleTrait {

  @throws[ArrayIndexOutOfBoundsException]("Index")
  @throws[NullPointerException]("Index")
  def getValue(array: Array[Int]) : Int
}
