package assignment.date19
import java.util
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
  ef calculateMaxGroupSize(n:util.List[Int]):Int={

    var count:Int=0
    var result=0
    var i=0

    for(i <- 0 until n.size()){
      if(n.get(i)==1){
        count=count+1
        result=Math.max(result,count)
      }
      else
        count=0
    }
    result
  }


}

 final def calculateMaxGroupSizeTailRec(input: util.List[Int]): Int = {
    @tailrec
    def calculateMaxGroupSizeTailRec1(input: util.List[Int], temp: Int, max: Int) : Int = {
      var countmax = max
      var count = temp
      if (input.size() == 0) {
        max
      } else {
        if (input.get(0) == 1) {
          count += 1
        } else {
          count = 0
        }
        if (countMax < count) {
          countMax = count
        }
        calculateMaxGroupSizeTailRec1(input.subList(1, input.size), count, countMax)
      }
    }
    calculateMaxGroupSizeTailRec1(input, 0, 0)
  }
}
