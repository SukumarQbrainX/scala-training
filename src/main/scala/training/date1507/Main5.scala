package training.date1507

object Main5 extends App {

  sealed trait Day

  class Monday extends Day
  class Tuesday extends Day
  class Wednesday extends Day
  class Thursday extends Day
  class Friday extends Day
  class Saturday extends Day
  class Sunday extends Day

  def isWeekend(day: Day): Boolean = day match {
    case _ : Monday => false
    case _ : Tuesday => false
    case _ : Thursday => false
    case _ : Wednesday => false
    case _ : Saturday => true
    case _ : Friday => false
    case _ : Sunday => true
  }

  println(isWeekend(new Monday))
}
