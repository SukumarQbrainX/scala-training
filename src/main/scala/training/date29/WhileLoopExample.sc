

var i = 0
val n = 5

val a: Unit = while (i <= n) {
  println(i)
  i += 1
}

println(a.toString)

val b: Unit = for (i <- 0 to n) {

  println(i)
}

println(a.toString)

val c: Seq[Int] = for (i <- 0 to n) yield {
  val temp = i + 1
  temp
}

println(c)

val d= {
  println("Asdasd")
  23
}

val e = {
  lazy val temp = {
    println("asdasd")
    12
  }
  23 + temp
}
