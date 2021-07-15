package training.date1507

object Main4 extends App {

  sealed trait Day

  case object Monday extends Day
  case object Tuesday extends Day
  case object Wednesday extends Day
  case object Thursday extends Day
  case object Friday extends Day
  case object Saturday extends Day
  case object Sunday extends Day

  def isWeekend(day: Day): Boolean = day match {
    case Monday => false
    case Tuesday => false
    case Thursday => false
    case Wednesday => false
    case Saturday => true
    case Friday => false
    case Sunday => true
  }

  println(isWeekend(Monday))
}
