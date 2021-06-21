package assignment.date19

import AssignmentDate19.User

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
class Assignment4 {
  def user(name:String,mobileNumber:Long): Unit ={
    val u=new User(name,mobileNumber)
    println(u.getName)
    println(u.getMobile)
  }

}


