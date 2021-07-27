package training.date2707

import training.date2707.GenericListExample.Node

object ScalaMain extends App {

  val node = Node[Int](1, None)

  val node1: Node[Int] = Node(1, Some(Node(2, None)))

  val node2: Node[String] = Node("Java", Some(Node("Scala", Some(Node("JS", None)))))
  val node3: Node[String] = Node[String]("Java", Some(Node[String]("Scala", Some(Node[String]("JS", None)))))
  val node4: Node[Any] =
    Node("Java", Some(Node(1, Some(Node(true, None)))))

  val a: String = node2.data
  val b: Int = node1.data

  val genericListExample = new GenericListExample

  import genericListExample._

  traverse(Some(node))
  println(">>>>>>>>>>>>>>>>>>>>>>>>>")
  traverse[Int](Some(node1))
  println(">>>>>>>>>>>>>>>>>>>>>>>>>")
  traverse[String](Some(node2))
  println(">>>>>>>>>>>>>>>>>>>>>>>>>")
  traverse(Some(node3))
  println(">>>>>>>>>>>>>>>>>>>>>>>>>")
  traverse(Some(node4))
}
