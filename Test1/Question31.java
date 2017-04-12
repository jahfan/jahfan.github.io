//
// Name: Anthony Jackson
// Date: 2/23/17
// Course: ITSE 1302
// Program: Test 1, Question 31
// Description: A Java program that prints a table with a list of 
//              at least 5 students together with their grades earned 
//              (lab points, bonus points, and the total)
//

public class Question31 {
    public static void main(String [] strArgs) {

        //creates a string for the banner.
        String strBanner = "///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 
                            + "\n" + "==          Student Points          ==\n" 
                            +  "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////\n";
        
        //creates a strinf for the labels of lab points, bonus points, and the total
        String strLabel = "Name      Lab      Bonus      Total"
                            + "\n----      ---      -----      -----";

        //creates a string for the students and their results.
        String strData = "Mary      27       7           34\n"
                         +"Howard    53       10          63\n"
                         +"Maxwell   90       10          100\n"
                         +"Jen       15       3           18\n"
                         +"Joe       65       5           70";
        
        //Outputs the results in the order of Banner, Label and Data to create the output.
        System.out.println(strBanner);
        System.out.println(strLabel);
        System.out.println(strData);      
    }       
}