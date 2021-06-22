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
    if (n == 0 || n < 1) {
      0
    } else if(n==1) {
      1
    }else{
      fib(n-1)+fib(n-2)
    }
  }
  //Tail Recursion

  final def fibTailRec(n: Int): Int = {
    @annotation.tailrec
    def getTailRec(n: Int, prev: Int, current: Int): Int = {
      if (n <= 0) {
        current
      } else {
        getTailRec(n - 1, prev = prev + current, current = prev)
      }
    }
    getTailRec(n, prev = 1, current = 0)
  }
}