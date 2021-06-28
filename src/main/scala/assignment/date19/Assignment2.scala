package assignment.date19
import java.util
/**
 * Create methods in such a way that it can take any number
 * of arguments and calculate sum.
 *  
 * For eg:-
 *    input            |   output
 *    -10                   -10
 *    -10, 8, -1            -3
 *    1, 2, 3, 4            10
 * 
 * Fxn description :-
 *   1. calculateSumUsingWhileLoop :- write the logic using while loop.
 *   2. calculateSumUsingForLoop :- write the logic using for loop.
 *   
 * Note :-
 *  in object `Main` write a function named "assignment2Run()"
 *  and write a logic to print the output on console.
 */
class Assignment2 {
  def calculateSumUsingWhileLoop(n:Int*): Int ={
    
    var i,sum=0
    var j=n.size()
    while(i <= j-1) {
      sum+=n(i)
      i+=1
    }
    sum
  }
  def calculateSumUsingForLoop(n: Int*): Int ={
    
    var sum=0
    for(i <- 0 until n.size()){
      sum+=n(i)
    }
    sum
  }


}
