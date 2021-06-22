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
    var counterMax = 0
    var counter = 0
    for(i <- 0 until input.size) {
      //println(" i......:" + i + ", input.get(i):" + input.get(i) )
      if (input.get(i) == 1) {
        counter += 1
      } else {
        //counterMax = counter
        counter = 0
      }
      if (counterMax < counter) {
        counterMax = counter
      }
      //println(".....counterMax>:" + counterMax + ", counter...........................:" + counter )
    }
    //println(" counterMax...........................:" + counterMax )
    counterMax
  }

  //@tailrec
  final def calculateMaxGroupSizeTailRec(input: util.List[Int]): Int = {
    @tailrec
    def calculateMaxGroupSizeTailRec1(input: util.List[Int], tempCount: Int, max: Int) : Int = {
      var counterMax = max
      var counter = tempCount
      if (input.size() == 0) {
        max
      } else {
        if (input.get(0) == 1) {
          counter += 1
        } else {
          counter = 0
        }
        if (counterMax < counter) {
          counterMax = counter
        }
        calculateMaxGroupSizeTailRec1(input.subList(1, input.size), counter, counterMax)
      }
    }
    calculateMaxGroupSizeTailRec1(input, 0, 0)
  }
}
