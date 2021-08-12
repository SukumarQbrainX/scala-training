package training.date1108

import java.io.PrintWriter

import scala.concurrent.Future
import scala.io.Source
import scala.util.{Failure, Success}

object ScalaMain1 extends App {

  implicit val ec = new MyExecutionContext

  println(">>>>>>>>>>>>>>>>>>>>>>")

  def read(filePath: String): Future[List[String]] =
    Future(Source.fromFile(filePath))
      .map(source => (source, source.getLines().toList))
      .map(sourceWithList => {
        sourceWithList._1.close()
        sourceWithList._2
      })

  def rowsCount(input: List[String]): Future[Int] =
    Future(input.tail.length)

  def writeToFile(filePath: String)(count: Int): Future[Int] =
    Future(new PrintWriter(filePath))
      .map(pr => (pr, pr.println(count)))
      .map(pr => {
        pr._1.close()
        count
      })

  def performOperation(inputPath: String, outputPath: String): Future[Int] =
    read(inputPath)
      .flatMap(rowsCount)
      .flatMap(writeToFile(outputPath)(_))

  performOperation("a1.csv", "a1.txt")
    .onComplete {
      case Success(value) =>
        println(value)
      case Failure(exception) =>
        exception.printStackTrace()
    }

  performOperation("a2.csv", "a2.txt")
    .onComplete {
      case Success(value) =>
        println(value)
      case Failure(exception) =>
        exception.printStackTrace()
    }

  println("+++++++++++++++++++++++")

}
