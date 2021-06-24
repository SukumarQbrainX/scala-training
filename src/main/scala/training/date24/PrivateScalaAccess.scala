package training.date24

class PrivateScalaAccess(private val name: String) {

  private[this] val rollNumber = 45

  def compareName(privateScalaAccess: PrivateScalaAccess): Boolean =
    this.name == privateScalaAccess.name


  def compareRollNumber(arg: Int): Boolean =
    this.rollNumber == arg
}

object PrivateScalaAccess {

  def compareName(privateScalaAccess: PrivateScalaAccess, privateScalaAccess1: PrivateScalaAccess): Boolean =
    privateScalaAccess.name == privateScalaAccess1.name
}

//object PrivateScalaAccess1 {
//
//  def compareName(privateScalaAccess: PrivateScalaAccess, privateScalaAccess1: PrivateScalaAccess): Boolean =
//    privateScalaAccess.name == privateScalaAccess1.name
//}
