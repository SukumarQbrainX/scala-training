package training.date0907

import java.util.Objects

class StudentClass(val name: String, val rollNumber: Int)
  extends Serializable with Product {

  def copy(name: String = this.name,
           rollNumber: Int = this.rollNumber): StudentClass =
    new StudentClass(name, rollNumber)

  override def toString: String =
    s"StudentClass($name,$rollNumber)"

  override def hashCode(): Int =
    Objects.hash(name, rollNumber)

  override def equals(obj: Any): Boolean = {
    if (obj == null) {
      false
    } else if (!obj.isInstanceOf[StudentClass]) {
      false
    } else {
      val tempObj: StudentClass = obj.asInstanceOf[StudentClass]
      (this.name == tempObj.name) && (this.rollNumber == tempObj.rollNumber)
    }
  }

  override def productArity: Int = 2

  override def productElement(n: Int): Any = {
    if (n == 0) {
      name
    } else if (n == 1) {
      rollNumber
    } else {
      throw new IndexOutOfBoundsException
    }
  }

  override def canEqual(that: Any): Boolean = equals(that)

  override def productElementName(n: Int): String = {
    if (n == 0) {
      "name"
    } else if (n == 1) {
      "rollNumber"
    } else {
      throw new IndexOutOfBoundsException
    }
  }
}

object StudentClass {

  def apply(name: String, rollNumber: Int): StudentClass =
    new StudentClass(name, rollNumber)

  def unapply(studentClass: StudentClass): Option[(String, Int)] =
    Option((studentClass.name, studentClass.rollNumber))
}
