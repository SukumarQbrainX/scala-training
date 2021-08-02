package training.date0208

object ArrayExample extends App {

  val array = Array(1, 2, 3, 4, 5)

  println(array(1))
  array(1) = 34
  println(array(1))

  val array1: Array[Int] = Array.fill(5)(1)
  val array2: Array[Int] = Array.tabulate(5)(index => index+1)
  val array3: Array[Int] = Array.empty

  val array4 = new Array[Int](6)

  println(array4.length)

  array4(1) = 45

  array4.foreach(println)

  def length(): Int = 45

  val array2D: Array[Array[Int]] = Array.ofDim[Int](2, 3)

  println(array2D.length)
  println(array2D.length)
  println("hello".length)
  println("hello".length)
  println(length())
}
