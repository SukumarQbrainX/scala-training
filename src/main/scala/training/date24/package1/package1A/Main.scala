package training.date24.package1.package1A

object Main extends App {

  val packageLevelAccess = new PackageLevelAccess

  println(packageLevelAccess.increment(1))
  println(packageLevelAccess.increment1(1))
  println(packageLevelAccess.increment2(1))
}
