package training.date2707

import scala.annotation.tailrec

import training.date2707.GenericListExample.Node

class GenericListExample {

  @tailrec
  final def traverse[Data](headOption: Option[Node[Data]]): Unit =
    headOption match {
      case Some(node) =>
        println(node.data)
        traverse(node.next)
      case None =>
    }
}

object GenericListExample {

  final case class Node[Data](data: Data, next: Option[Node[Data]])
}
