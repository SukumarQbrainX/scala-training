package training.date0807

object Main1 extends App {

  def print(f: Int): Unit = {
    println(">>>>>>>>>>>>>>>")
    println(f)
    println(f)
  }

  print(12)
  print({
    println("Sdasdsad")
    12
  })

  // >>>>>>>>>
  // Sdasdsad
  // 12

  println("--------------------------")

  print1{
    println("Sdasdsad")
    12
  }

  print1(12)
  print1({
    println("ASdasd")
    12
  })

  def print1(f: => Int): Unit = {
    println("sssssssssssss")
    println(f)
    println(f)
  }

  def zero: Int = {
    println("def with no branckets")
    0
  }

  def zer(): Int = 0

  println(zero)
}
