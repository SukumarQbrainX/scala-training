package assignment.date19

import scala.annotation.tailrec

/**
 *  Function description :- fib(n), fibTailRec(n)
 *
 *  1. fib(n) :- This should be the normal recursive function.
 *  2. fibTailRec(n) :- This should be the tail recursive function.
 *
 *  Input   |   Output
 *    > 0         0
 *    0           0
 *    1           1
 *    2           1
 *    3           2
 *    4           3
 *    5           5
 *
 *    ..... & so on
 *
 * Explanation :-
 *  Fib series :- 0 1 1 2 3 5 8 13
 *  Input :-      0 1 2 3 4 5 6 7
 *
 *  Steps to do :-
 *  1. In `fib(n: Int)` : remove "0" after "=" and write your own code
 *  2. In `fibTailRec(n:Int)` : remove the "fibTailRec(n)"
 *        after "=" and write your own code
 *
 * Note :-
 *  1. Please do not modify the method signature
 *  2. "main" method is present to print the output
 */
class Assignment1 {

  def fib(n: Int): Int = {
    var initial = 0
    var next = 1
    var counter = 0
    if (n.==(0) ||(n == 1)) {
      n
    } else {
      while (counter < n ) {
        val sum = initial + next;
        initial = next;
        next = sum;
        counter += 1
      }
      initial
    }
    /*if (n.==(0)) {
      0
    } else if (n == 1) {
      1
    } else if (n.<(0)) {
      //throw new RuntimeException("Number should be greater than or equals to zero!!!")
      println("Number should be greater than or equals to zero!!!")
      0
    } else {
      fib(n -1) + fib(n - 2)
    }*/
  }

  //@tailrec
  final def fibTailRec(n:Int): Int = {
    if (n < 2) {
      if (n < 0) println(" negative number ")
      n
    } else {
      @tailrec
      def fibTailRecInner(n: Int, a: Int, b: Int): Int = {
        fibTailRecInner(n - 1, b, a + b)
      }
      fibTailRecInner(n, 0, 1)
    }
  }

  final def fibTailRec1(n:Int): Int = {
    if (n < 2) {
      if (n < 0) println(" negative number ")
      n
    } else {
      @tailrec
      def fibTailRecInner(n: Int, a: Int, b: Int): Int = {
        fibTailRecInner(n - 1, b, a + b)
        /*if (n < 2) {
          a
        } else {
          fibTailRecInner(n - 1, b, a + b)
        }*/
        /*case 0 => a
      case _ => fibTailRecInner(n - 1, b, a + b)*/
      }

      fibTailRecInner(n, 0, 1)
    }
  }

  //@tailrec
  final def fibTailRec2(n:Int): Int = {
    @tailrec
    def fibTailRecInner(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fibTailRecInner(n - 1, b, a + b)
    }
    fibTailRecInner(n, 0 , 1)
  }
}
