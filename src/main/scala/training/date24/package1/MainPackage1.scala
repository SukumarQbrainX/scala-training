package training.date24.package1

import training.date24.package1.package1A.PackageLevelAccess

object MainPackage1 extends App {

  val packageLevelAccess = new PackageLevelAccess

//  println(packageLevelAccess.increment(1))
  println(packageLevelAccess.increment1(1))
  println(packageLevelAccess.increment2(1))
}
