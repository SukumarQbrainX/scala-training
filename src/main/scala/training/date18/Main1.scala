package training.date18

object Main1 {

  def main(args: Array[String]): Unit = {

    val scalaJavaOpExample = new ScalaJavaOpExample

    println(scalaJavaOpExample.javaList)
    scalaJavaOpExample.javaList.add(1)
    scalaJavaOpExample.javaList.add(1)
    scalaJavaOpExample.javaList.add(1)
    println(scalaJavaOpExample.javaList)

    println(scalaJavaOpExample.javaMap)
    scalaJavaOpExample.javaMap.put(1,"sasas")
    scalaJavaOpExample.javaMap.put(2,"sasas")
    scalaJavaOpExample.javaMap.put(3,"sasas")
    println(scalaJavaOpExample.javaMap)

    println(scalaJavaOpExample.date)

    println(scalaJavaOpExample.student)

    println(scalaJavaOpExample.student.getName)
    println(scalaJavaOpExample.student.getRollNumber)

  }
}
