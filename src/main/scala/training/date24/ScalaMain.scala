package training.date24

import training.date24.package1.package1A.PackageLevelAccess
import training.date24.package2._

import package3._

object ScalaMain extends ProtectedScalaClass with App {

  val privateScalaAccess = new PrivateScalaAccess("SAdasdas")

//  println(packageLevelAccess.increment(1))
//  println(packageLevelAccess.increment1(1))
//  println(packageLevelAccess.increment2(1))

  //  privateScalaAccess.name

//  val protectedScalaClass = new ProtectedScalaClass

  add(1, 2)

  println(ZERO)

  println(package3.ZERO)

//  protectedScalaClass.add(1, 2)
}
