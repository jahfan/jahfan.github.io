//
// Name: Anthony Jackson
// Date: 2/23/17
// Course: ITSE 1302
// Program: Test 1, Question 33
// Description: Alters the program to calculate and output the circumference of two circles. 
//

public class Question33 { 
    public static void main(String[] args) {
      
      //Variable names changed to fit class format.
      final double DBLPI = 3.14159; 
      int intRadius = 10;
      double dblArea = DBLPI * (intRadius * intRadius); 

      //Created a variable for circumference taht uses the formula (2 * Pi * r).   
      double dblCircumference = 2 * DBLPI * intRadius;
      System.out.println("The area of a circle with radius " + intRadius + " is " + dblArea);

      //Output the circumference for the first circle. \n for easier to read format
      System.out.println("The circumference of a circle with radius " + intRadius + " is " + dblCircumference + "\n"); 
      intRadius = 20; 
      dblArea = DBLPI * (intRadius * intRadius); 

      //Change value of circumference to match the new radius.
      dblCircumference = 2 * DBLPI *intRadius;
      System.out.println("The area of a circle with radius " + intRadius + " is " + dblArea);

      //Output the circumference for the second circle.
      System.out.println("The circumference of a circle with radius " + intRadius + " is " + dblCircumference); 
   } 
}   