package training.date2907

object WildCard extends App {

  def increment(x: Int)(fxn: Int => Int): Int = fxn(x)

  println(increment(1)(f => f + 2))
  println(increment(1)(f => f + f))
  println(increment(1)(_ + 3))
  println(increment(1)(_ + 23))

  val list: List[String] = List("1", "2", "3")

  val list1: List[Int] = list.map(f => {
    println("neeeee")
    f.toInt
  })

  val list2 = list.map(_.toInt)

  val fxn: String => List[Char] =
    f => f.toCharArray.toList

  println(fxn("!21212"))

  val fxn1: String => List[Char] =
    _.toCharArray
      .toList

  def calculate(a: Int, b: Int)(fxn: (Int, Int) => Int): Int =
    fxn(a, b)

  println(calculate(12, 2)((a, b) => a + b))
  println(calculate(12, 2)((a, b) => a - b))
  println(calculate(21, 2)((a, b) => a * b))
  println(calculate(12, 2)((a, b) => a / b))

  println(calculate(12, 2)(_ + _))
  println(calculate(12, 2)(_ - _))
  println(calculate(21, 2)(_ * _))
  println(calculate(12, 2)(_ / _))

  class A(val a: Int)

  val a: A = new A(12)

  def print(x: Int)(fxn: Int => A): Unit = println(fxn(x).a)

  print(1)(f => new A(f))

  print(1)(new A(_))

  val aaa: Int => A = new A(_)

  print(21)(f => new A(f))
  print(21)(f => new A(2323))
  print(212)(_ => new A(121212))

  "Jee" match {
    case x => println(x)
  }

  "Jee" match {
    case _ => println("defaut")
  }
}
