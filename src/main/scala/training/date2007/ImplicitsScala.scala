package training.date2007

import spray.json.DefaultJsonProtocol._
import spray.json._
import training.date2007.ScalaMain5.{Student, StudentNormalClass}

object ImplicitsScala {

  class StringOps(para: String) {
    def splitAndAdd: Int = {
      val split: Array[String] = para.split(" ")
      val intArray: Array[Int] = split.map(f => f.toInt)
      var sum = 0
      for (i <- intArray) {
        sum += i
      }
      sum
    }
  }

  implicit def arg(x: String): StringOps = new StringOps(x)

  implicit val studentJsonFormat: RootJsonFormat[Student] =
    jsonFormat2(Student)

  implicit val studentNormalClass: RootJsonFormat[StudentNormalClass] =
    new RootJsonFormat[StudentNormalClass] {
      override def write(obj: StudentNormalClass): JsValue = obj.mobile match {
        case Some(mobile) =>
          JsObject("mobileNumber" -> JsString(mobile), "name" -> JsString(obj.name))
        case None =>
          JsObject("name" -> JsString(obj.name))
      }

      override def read(json: JsValue): StudentNormalClass = ???
    }
}
