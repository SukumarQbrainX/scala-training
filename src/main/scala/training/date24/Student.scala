package training.date24

class Student private (val name: String, val rollNumber: Int) {

//  println(Instant.now())

  import java.time.Instant

  println(Instant.now())

  def printStudentData() = {

    Student.printStudentData(this)
  }
}

object Student {

  def newInstance(name: String, rollNumber: Int): Student = {
    import java.util.Date
    println(new Date())
    new Student(name, rollNumber)
  }

  def printStudentData(student: Student): Unit = {
    println(student.name)
    println(student.rollNumber)
  }
}
