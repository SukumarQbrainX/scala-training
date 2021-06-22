package training.date21

object Main2 extends App {

  def app(): Unit = ()

  val a2: Unit = ()

  val a1: Unit = app()

  println(a1.toString)
  println(a2.toString)

  //  val student1 = new Student("Deepa")
  //  val student2 = new Student("Akash")

  //  val scalaStudent1 = new ScalaStudent("Deepa")
  //  val scalaStudent2 = new ScalaStudent("Akash")

//  println(
//    Student.checkEquality(
//      Student.newInstance("ASas"),
//      Student.newInstance("ASas")))
//
//  println(
//    ScalaStudent.checkEquality(
//      ScalaStudent.newInstance("Asas"),
//      ScalaStudent.newInstance("asdasdasd")))

  val a = Student.newInstance("Asass")
  val b = ScalaStudent.newInstance("Asas")

  println()

  Student.printName(a)
  ScalaStudent.printName(b)

  println(b.getUniversity)

  println(a.checkInstanceEquality(a))

  Main4.main()

  val application: Application = Main4

  println(application.main())

  println(Main5.main(Array.empty))

  println(application.run())
}
