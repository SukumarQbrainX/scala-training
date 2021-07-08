package training.date0807

object Main extends App {

  val lazyValDefExample = new LazyValDefExample

  lazyValDefExample.printInt(lazyValDefExample.a2)

  println(">>>>>>>>>>>>>>>>>>>>")
  println(lazyValDefExample.a1)
  println(lazyValDefExample.a2)
  println(lazyValDefExample.a3)
  println(">>>>>>>>>>>>>>>>>>>>")

  println(">>>>>>>>>>>>>>>>>>>>")
  println(lazyValDefExample.a1)
  println(lazyValDefExample.a2)
  println(lazyValDefExample.a3)
  println(">>>>>>>>>>>>>>>>>>>>")
}
