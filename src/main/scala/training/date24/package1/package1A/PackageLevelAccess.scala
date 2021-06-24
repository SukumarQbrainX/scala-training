package training.date24.package1.package1A

class PackageLevelAccess {

  private[package1A] def increment(a: Int): Int = a + 1

  private[package1] def increment1(a: Int): Int = a + 1

  private[date24] def increment2(a: Int): Int = a + 1
}
