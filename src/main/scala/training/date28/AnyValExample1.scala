package training.date28

class AnyValExample1(val price: Double = 34.4) extends AnyVal

class AnyValExample2(val anyValExample1: AnyRefExample) extends AnyVal

class AnyValExample3(val unitVar: Unit = ()) extends AnyVal

//class AnyValExample4(val anyValExample2: AnyValExample2) extends AnyVal
