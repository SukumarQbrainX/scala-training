package training.date2607

trait Example {

  def add(a: Int, b: Int): Int

  def increment(a: Int): Int = add(a, 1)
}

trait Example1 {
  self: Example =>

  override def add(a: Int, b: Int): Int = {
    println("Overrided from Example1")
    a + b
  }
}

trait Example2 {
  self: Example =>

  override def add(a: Int, b: Int): Int = {
    println("Overrided from Example2")
    a + b
  }
}

trait Example3 extends Example {

  override def add(a: Int, b: Int): Int = {
    println("Overrided from Example3")
    a + b
  }
}

class ExampleImpl extends Example {
  override def add(a: Int, b: Int): Int = a + b
}

class ExampleImpl1 extends Example with Example2 with Example1

class ExampleImpl2 extends Example3

class ExampleImpl3 extends Example with Example1

trait Example4 {

  sss : Example => {
    println("I am cllling super class method")

    println(sss.add(1, 20))
  }
}

class ExampleImpl4 extends Example with Example4 {
  override def add(a: Int, b: Int): Int = {
    println("Overrided from ExampleImpl4")
    a + b
  }
}

trait Example6 { self: Example =>
  override final def add(a: Int, b: Int): Int = {
    println("Overrided from Example6")
    a + b
  }

  def print(a: Int, b: Int): Unit
}

class ExampleImpl5 extends Example with Example6 {
  override def print(a: Int, b: Int): Unit = ???
}

trait Example7 {

  self: Example => {
    println(self.add(2, 4))

  }

  def Zero: Int
}

