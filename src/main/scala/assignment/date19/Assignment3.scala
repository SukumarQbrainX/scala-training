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
    var ctr=0
    var ctm = 0
    for(i <- 0 until input.size) {
      if (input.get(i) == 1) {
        ctr += 1
      } else {
        ctr = 0
      }
      if (ctm < ctr) {
        ctm = ctr
      }
    }
    ctm
  }

 final def calculateMaxGroupSizeTailRec(input: util.List[Int]): Int = {
  @tailrec
  def calculateMaxGroupSizeTailRec1(input: util.List[Int], tc: Int, mx: Int) : Int = {
    var ctr = tc
    var ctm = mx
  if (input.size() == 0) {
  mx
  } else {
  if (input.get(0) == 1) {
  ctr += 1
  } else {
  ctr = 0
  }
  if (ctm < ctr) {
  ctm = ctr
  }
  calculateMaxGroupSizeTailRec1(input.subList(1, input.size), ctr, ctm)
  }
  }
  calculateMaxGroupSizeTailRec1(input, 0, 0)
  }
  }
}
