package training.date0907

import java.util

object Main extends App {

  val student: Student = new Student("Nms", 1)
  val studentClass: StudentClass = new StudentClass("nsdas", 2)

  val student1: Student = Student("Nms", 1)
  val studentClass1: StudentClass = StudentClass("nsdas", 2)

  val student2: Student = Student.apply("Nmes", 1)
  val studentClass2: StudentClass = StudentClass.apply("nsda1s", 2)

  println(student.name)
  println(student.rollNumber)

  println(studentClass.name)
  println(studentClass.rollNumber)

  println(student)
  println(studentClass)

  val javaStudentSet = new util.HashSet[Student]()
  val javaStudentClassSet = new util.HashSet[StudentClass]()

  javaStudentSet.add(student)
  javaStudentSet.add(student1)
  javaStudentSet.add(student2)

  javaStudentClassSet.add(studentClass)
  javaStudentClassSet.add(studentClass1)
  javaStudentClassSet.add(studentClass2)

  println(">>>>>>>>>>>>>>>>>>>>>>>>")
  println(javaStudentSet.size())
  println(javaStudentSet)
  println(javaStudentClassSet.size())
  println(javaStudentClassSet)
  println(">>>>>>>>>>>>>>>>>>>>>>>>")

  println(student.hashCode())
  println(student1.hashCode())
  println(student2.hashCode())

  println(studentClass.hashCode())
  println(studentClass1.hashCode())
  println(studentClass2.hashCode())

  println(student == student1)
  println(student equals student1)
  println(student.equals(student1))
  println(student.equals(student2))


  println(studentClass == studentClass1)
  println(studentClass equals studentClass1)
  println(studentClass.equals(studentClass1))
  println(studentClass.equals(studentClass2))

  println("<>>>>>>>>>>>>")

  val Student(studentName1, studentRollNumber1) = student

  println(studentName1)
  println(studentRollNumber1)

  val StudentClass(studentClassName1, studentClassRollNumber1) = studentClass

  println(studentClassName1)
  println(studentClassRollNumber1)

  val unapplyStudent: Option[(String, Int)] = Student.unapply(student)
  val unapplyStudentClass: Option[(String, Int)] = StudentClass.unapply(studentClass)

  println(student.isInstanceOf[Serializable])
  println(studentClass.isInstanceOf[Serializable])

  val iterator: Iterator[Any] = student.productIterator
  println(">>>>>>>>>>>>>>>>")
  while (iterator.hasNext) {
    println(iterator.next())
  }
  println(">>>>>>>>>>>>>>>>")
  val iteratorName: Iterator[String] = student.productElementNames
  while (iteratorName.hasNext) {
    println(iteratorName.next())
  }
println(">>>>>>>>>>>>")
  println(student.productElement(1))
  println(student.productElementName(1))


  val iterator1: Iterator[Any] = studentClass.productIterator
  println(">>>>>>>>>>>>>>>>")
  while (iterator1.hasNext) {
    println(iterator1.next())
  }

  println(student.isInstanceOf[Product])
  println(studentClass.isInstanceOf[Product])

  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>")

  val student3: Student = student1.copy()

  println(student == student3)
  println(student eq student3)
  println(student eq student)

  val student4: Student = student.copy(rollNumber = 2)
  val student5: Student = student.copy(name = "Asdasd")
  val student6: Student = student.copy("Asdasdd", 2)

  println(student4 eq student5)
}
