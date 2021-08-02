package training.date0208

object SetExample extends App {

  val set = scala.collection.immutable.Set(1,2,3,4,4)
  val set1 = Set.apply(1,2,3,3,3,3,4)

  val fill = Set.fill(5)(1)
  val tabulate = Set.tabulate(2)(index => index + 1)
  val empty = Set.empty[Int]
}
