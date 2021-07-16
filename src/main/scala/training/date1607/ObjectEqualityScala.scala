package training.date1607

object ObjectEqualityScala extends App {


  class A(val variable: Int) {

    override def equals(obj: Any): Boolean = {
      if (obj == null || !obj.isInstanceOf[A]) {
        false
      } else if (this eq obj.asInstanceOf[AnyRef]) {
        true
      } else {
        val secondObj = obj.asInstanceOf[A]
        secondObj.variable == this.variable
      }
    }
  }

  /**
   * 1. If we do not have any implementation of equals method then all the three
   *      eq, ==, equals would behave in the same manner and will check for object refrence equality.
   * 2. eq will always check for object refrence equality
   * 3. == and equals would behave in the same manner if the equals method is overrided
   * 4. the difference between == and equals are :-
   *    a. == is a method of Any class and is a final method i.e we can not override the == method
   *    b. == uses the implementation of equals method and can also able to handle null objects while equals method would
   *        throw null pointer exception.
   */

  val a = new A(23)
  val a1 = new A(23)

  println(">>>>>>>>>>>>>>>>>")
  println(a == a1)
  println(a equals a1)
  println(a eq a1)
  println(">>>>>>>>>>>>>>>>>")
  println(a.==(a1))
  println(a.equals(a1))
  println(a.eq(a1))
  println(">>>>>>>>>>>>>>>>>")

  println(null.==(null))
  println(null == null)
//  println(null.equals(null))

  println(a equals null)

  println(">>>>>>>>>>>>>>>>>>")
  println(a eq a)
}
