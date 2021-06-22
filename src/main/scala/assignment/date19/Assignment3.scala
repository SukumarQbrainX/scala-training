package assignment.date19

import java.util

import scala.annotation.tailrec

/**
 * Write a logic to satisfy the following condition
 *
 * Suppose you have a list of binary number like this for eg :-
 * List(1,1,1,0,0,1,1) you need to find the
 * max group size of continuous 1.
 *
 * input :-
 *  List(1,1,1,0,0,1,1)
 * output :-
 *  3
 * explanation :-
 * there are two groups of 1
 *  1. (1, 1, 1)
 *  2. (1, 1)
 * So the first group has the size 3 and second group has the size 2
 * and as 3 > 2 therefore the output of this is 3
 *
 *        Input                         |     output
 *       1, 1, 1                               3
 * 0, 1, 1, 0, 1, 0, 1, 1, 1, 0                3
 *      0, 0 , 0                               0
 *      1, 0                                   1
 * 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1             4
 *
 * Note :-
 *  1. Do it via tail recursion & non-tail recursion both
 */
class Assignment3 {

  def calculateMaxGroupSize(input: util.List[Int]): Int = {
    var count = 0
    var result = 0
    def max(a: Int, b: Int): Int = {
      if (a < b) {
        b
      } else {
        a
      }
    }
    for (i <- 0 until input.size()) {
      if (input.get(i) == 0) {
        count = 0
      } else {
        count += 1
        result = max(result, count)
      }
    }
    result

  }
}


 //def calculateMaxGroupSizeTailRec(input: util.List[Int]): Int = {

//}
