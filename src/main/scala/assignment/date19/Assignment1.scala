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
    if (n == 0)
      return 0
    else if (n == 1)
      return 1
    if (n > 1) {
      return fib(n-1) + fib(n -2)
    } else {
      return (-1) * fib (n + 1) + fib ( n + 2)
    }
  }

  @tailrec
  final def fibTailRec( n:Int, curr : Int = 1, prev:Int = 0): Int = {
    if (n == 0)
      return prev
    else if (n == 1)
      return curr
    if (n > 1) {
      fibTailRec(n-1, prev = curr,  curr = curr + prev)
    } else {
      fibTailRec((n + 1), prev = -curr,  curr = curr - prev)
    }

  }
}
