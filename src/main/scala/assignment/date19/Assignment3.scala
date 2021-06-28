package assignment.date19

import java.util
import java.util.Comparator

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

  def calculateMaxGroupSize(input: util.List[Int],
                            maxSize:Int = 0,
                            currSize:Int = 0,
                            count: Int=0): Int = {
    return 1
  }

  @tailrec
  final def calculateMaxGroupSizeTailRec(input: util.List[Int],
                                         maxSize:Int = 0,
                                         currSize:Int = 0,
                                         count: Int=0): Int = {
    if (input.size() == count) {
      maxSize
    }
    else {
      val arrayValue = input.get(count)
      var localMaxSize = maxSize
      var localCurrSize = currSize
      if (arrayValue.equals(1)) {
        localCurrSize = localCurrSize + 1
      }
      if (localMaxSize < localCurrSize) {
        localMaxSize = localCurrSize
      }
      if (arrayValue.equals(0)) {
        localCurrSize = localCurrSize - localCurrSize
      }
      calculateMaxGroupSizeTailRec(input, localMaxSize, localCurrSize, count + 1)
    }

  }
}
