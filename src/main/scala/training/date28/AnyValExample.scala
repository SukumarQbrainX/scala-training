package training.date28

class AnyValExample {

  val variableInt: Int = 23

  val anyValExample1 = new AnyValExample1(34)

  val anyValExample2: AnyValExample2 = new AnyValExample2(new AnyRefExample)

  val anyValExample3 = new AnyValExample3()
}
