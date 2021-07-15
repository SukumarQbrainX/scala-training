package training.date1507

object MainObj1 extends App {

  trait A1

  class A

  case class B() extends A

//  case class C() extends B()

  case object C extends A

//  case object D extends B()

  class N extends B()

//  class B1 extends C
}
