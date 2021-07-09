package training.date0907

import spray.json._
import spray.json.DefaultJsonProtocol._

object Main4 extends App {

  case class User(name: String, id: Int, mobile: Option[String])

  implicit val userJsonFormat: RootJsonFormat[User] =
    jsonFormat3(User)

  val user = User("Aakash", 1, Some("+911234567890"))

  val jsonString: String = user.toJson.prettyPrint

  println(jsonString)
}
