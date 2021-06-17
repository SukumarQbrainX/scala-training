package training.date16

class Example3 {

  // 1.
  def add(a: Integer, b: Int): Int = {
    a + b
  }

  // 2.
  def add1(a: Int, b: Int) = {
    a + b
  }

  // 3.
  def add2(a: Int, b: Int): Int = a + b

  // 4.
  def add3(a: Int, b: Int) = a + b


  // 5.
  def max(a: Int, b: Int): Int =
    if (a > b)
      a
    else
      b

  // 6.
  def max1(a: Int, b: Int): Int =
    if (a > b) {
      a
    }
    else {
      b
    }

  // 7.
  def add4(a: Int, b: Int): Int = {
    val c = a + b
    c
  }

  def print(a: Int, b: Int) {
    println(a + b)
  }

  def print1(a: Int, b: Int): Unit = {
    println(a + b)
  }

  def add5(a: Int, b: Int): Int = {
    a + b
  }

  def add6(a: Int, b: Int): Int = {
    return a + b
  }

//  def add7(a: Int, b: Int) = {
//    return a + b
//  }

//  def fact(n: Int) = {
//    if (n <= 1) {
//      1
//    } else {
//      n * fact(n - 1)
//    }
//  }

  def fact1(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      n * fact1(n - 1)
    }
  }

  def varargs(arg: Int*): Int = {
    var sum = 0
    for (x <- arg) {
      sum += x
    }
    sum
  }
}
