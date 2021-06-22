package assignment.date19

/**
 * Create a class in java inside the package "assignment.date19"
 * named "User" with two private final field name and mobileNumber
 * and two getters.
 *
 * In this class create a method which takes argument of type "User"
 * and print the its name and mobileNumber.
 *
 * Note :-
 *  in object `Main` write a function named "assignment4Run()"
 *   and write a logic to print the output on console.
 */
import scala.Long;
public class User {
        private final String name;
        private final long mobileNumber;
    public User(String name, long mobileNumber) {
            this.name = name;
            this.mobileNumber = mobileNumber;
        }
        public String getName() {
            return name;
        }
        public long getMobileNumber() {
            return mobileNumber;
        }
    }

package assignment.date19
class Assignment4 {
  def assignment4Run(name:String,mobileNumber:Long): Unit ={
    val u=new User(name,mobileNumber)
    println(u.getName+" --> "+u.getMobileNumber)
  }
  def main(args:Array[String]): Unit ={

    assignment4Run("AAA",123456789)
    assignment4Run("BBB",103050709)
    assignment4Run("CCC",2040608010)
    assignment4Run("DDD",123123123)
  }
}


}
