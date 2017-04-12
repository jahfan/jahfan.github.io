//
// Name: Anthony Jackson
// Date: 4/11/17
// Program: Memo.java (Question 31)
// Descrition: Class with functions to get/set Year, Month, Message or all at once. + a toString method. Main method to show how class works. Checks for invalid months. 
//              Now includes menu so user can print and add memos.
//


import java.util.ArrayList;
import java.util.*;

public class Memo {

        //Defaults for the year, month and message
        int intYear = 0000;
        String strMonth = "None";
        String strMessage = "Nothing";
        
        //Scanner obj created for the year, month and message. Made 3 because had input errors when using the same one multiple times.
        ArrayList<String> aryMemos = new ArrayList<String>(); 
        Scanner objScannerYear = new Scanner(System.in);
        Scanner objScannerMonth = new Scanner(System.in);
        Scanner objScannerMessage = new Scanner(System.in);

        //Method that receives an int from the user and set it as a year.
        public void setYear(int pintYear) {
            
            this.intYear = pintYear;
        }

        //Returns the current value of intYear
        public int getYear() {
            return intYear;
        }

        //Method receives a string from user and gives the string strMonth
        public void setMonth(String pstrMonth) {
            this.strMonth = pstrMonth;
        }

         //Returns the string value in strMonth   
        public String getMonth() {
            return strMonth;
        }

        //Method recieves a string from user and gives that string to strMessage
        public void setMessage(String pstrMessage) {
            strMessage = pstrMessage;
        }

        //Returns the string value in strMessage
        public String getMessage() {
            return strMessage;
        }


        //Method gets the values for the year, month and message. Those values to intYear, strMonth and strMessage in that order
        public void setAll() {

            //Prompts user for year and sets following int to intYear
            System.out.println("Please set a year.");
            this.intYear = objScannerYear.nextInt();

            //Prompts user for month
            System.out.println("Please set a month. Both the full name and shorter versions (First three letters) are accepted.");

            /* do {
                strMonth = user input string;

                if(strMonth != to valid month)
                    strMonth = user input string;
            }while(strMonth != to a valid month)*/
            do {
                this.strMonth = objScannerMonth.next();

                if(strMonth.compareToIgnoreCase("January") != 0 && strMonth.compareToIgnoreCase("February") != 0 && strMonth.compareToIgnoreCase("March") != 0 &&
                    strMonth.compareToIgnoreCase("April") != 0 && strMonth.compareToIgnoreCase("May") != 0 && strMonth.compareToIgnoreCase("June") != 0 &&
                    strMonth.compareToIgnoreCase("July") != 0 && strMonth.compareToIgnoreCase("August") != 0 && strMonth.compareToIgnoreCase("September") != 0 &&
                    strMonth.compareToIgnoreCase("October") != 0 && strMonth.compareToIgnoreCase("November") != 0 && strMonth.compareToIgnoreCase("December") != 0 &&
                    strMonth.compareToIgnoreCase("Jan") != 0 && strMonth.compareToIgnoreCase("Feb") != 0 && strMonth.compareToIgnoreCase("Mar") != 0 &&
                    strMonth.compareToIgnoreCase("Apr") != 0 && strMonth.compareToIgnoreCase("May") != 0 && strMonth.compareToIgnoreCase("Jun") != 0 &&
                    strMonth.compareToIgnoreCase("Jul") != 0 && strMonth.compareToIgnoreCase("Aug") != 0 && strMonth.compareToIgnoreCase("Sep") != 0 &&
                    strMonth.compareToIgnoreCase("Oct") != 0 && strMonth.compareToIgnoreCase("Nov") != 0 && strMonth.compareToIgnoreCase("Dec") != 0) {
                        strMonth = objScannerMonth.next();
                    }

            } while(strMonth.compareToIgnoreCase("January") != 0 && strMonth.compareToIgnoreCase("February") != 0 && strMonth.compareToIgnoreCase("March") != 0 &&
                    strMonth.compareToIgnoreCase("April") != 0 && strMonth.compareToIgnoreCase("May") != 0 && strMonth.compareToIgnoreCase("June") != 0 &&
                    strMonth.compareToIgnoreCase("July") != 0 && strMonth.compareToIgnoreCase("August") != 0 && strMonth.compareToIgnoreCase("September") != 0 &&
                    strMonth.compareToIgnoreCase("October") != 0 && strMonth.compareToIgnoreCase("November") != 0 && strMonth.compareToIgnoreCase("December") != 0 &&
                    strMonth.compareToIgnoreCase("Jan") != 0 && strMonth.compareToIgnoreCase("Feb") != 0 && strMonth.compareToIgnoreCase("Mar") != 0 &&
                    strMonth.compareToIgnoreCase("Apr") != 0 && strMonth.compareToIgnoreCase("May") != 0 && strMonth.compareToIgnoreCase("Jun") != 0 &&
                    strMonth.compareToIgnoreCase("Jul") != 0 && strMonth.compareToIgnoreCase("Aug") != 0 && strMonth.compareToIgnoreCase("Sep") != 0 &&
                    strMonth.compareToIgnoreCase("Oct") != 0 && strMonth.compareToIgnoreCase("Nov") != 0 && strMonth.compareToIgnoreCase("Dec") != 0);
            

            //Prompts user for message and sets following string to strMessage
            System.out.println("Please enter a message.");
            this.strMessage = objScannerMessage.nextLine();


        }

        //Outputs the month year and message as a string
        public String toString() {
            return "[" + strMonth + ", " + intYear + ": " + strMessage + "]";
        }


        //Main function to run methods in memo.java
        public static void main(String [] strArgs) {
            
            //Local ariables used in main function
            int intOption;
            int intMemoCount = 0;

            //Memo obj for manipulating methods in memo.java.
            Memo objMemo = new Memo();
            //Local scanner for user input in main function.
            Scanner objScannerMenu = new Scanner(System.in);


            /*
            do {
                Output menu

                intOption = user input integer;

                if(option not valid) {
                    intOption = user input integer;
                }

                switch (intOption)
                    1:
                        set all parameters
                        add parameters to array ArrayList
                        intMemo count ++
                        break
                    2:
                        local scanner
                        local variable intLCV
                        if(nothing added yet) {
                            output defaults
                            break
                        }
                        else {
                            chose memo you want to output
                            intLCV = choice - 1
                            ouput arrayList[intLCV]
                        }
                        break
                    3:
                        intOption = 5
                        break
                    default:
                        Error should be here!
                        break

            }while(option !=5)
            */  
            do {
                System.out.println("Please chose an option. \n");
                System.out.println("     ////Menu\\\\\\\\     ");
                System.out.println("     ------------     ");
                System.out.println("                      ");
                System.out.println("Option 1: Add Memo    ");
                System.out.println("Option 2: Print Memo  ");
                System.out.println("Option 3: Quit        ");
                System.out.println("You have " + intMemoCount + " memo(s) so far."    );


                intOption = objScannerMenu.nextInt();

                if(intOption < 1 || intOption > 3) {
                    System.out.println("Error:: Invalid option pick another.");
                    intOption = objScannerMenu.nextInt();
                }


                switch (intOption) {
                    case 1:
                            objMemo.setAll();
                            objMemo.aryMemos.add(objMemo.toString());
                            intMemoCount++;
                            break;
                    case 2: 
                            Scanner objScannerPrint = new Scanner(System.in);
                            int intLCV;

                            if(intMemoCount == 0) {
                                objMemo.aryMemos.add(objMemo.toString());
                                System.out.println(objMemo.aryMemos);
                                objMemo.aryMemos.clear();
                                break;
                            }
                            else {
                                System.out.println("What memo do you want to print? You have " + intMemoCount + " memos. Use numbers." );
                                intLCV = objScannerPrint.nextInt() - 1;
                                System.out.println(objMemo.aryMemos.get(intLCV));
                            }

                            break;
                    case 3: 
                            intOption = 5;
                            break;
                    default:
                            System.err.print("Error:: You shouldn't be here!'");
                            intOption = 5;
                            break;

                }

            } while(intOption != 5);
            
        }
}