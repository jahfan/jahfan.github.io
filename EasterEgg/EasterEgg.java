//
// Name: Anthony Jackson
// Date Last Edited: 4/25/17
// Program: Assignment Egg
// Description: Program that prints out Easter Eggs with selected symbol inside.
//

public class EasterEgg {

    //Variable that sets default symbol for Easter Egg.
    char chrSymbol = '#';

    //Function that changes that copies the contents of pchrSymbol into chrSymbol when called.
    public void setSymbol(char pchrSymbol) {
        chrSymbol = pchrSymbol;
    }
    //Function that returns the variable stored in chrSymbol when called.
    public char getSymbol() {
        return chrSymbol;
    }
    //Function that prints out an Easter Egg with chrSymbol inside when called.
    @Deprecated
    public void print(char pcharOutput) {
        setSymbol(pcharOutput);
        System.out.println(this);
    }
    //Invalidates the print function by allowing the object to print itself when called.
    public String toString() {
        //Initializes the string so it can be added onto with +='s.
        String strEggOutput = "";
        
        //The series of strings that make up the Easter Egg output.
        strEggOutput += "  __  \n" + " /" + getSymbol() + getSymbol(); 
        strEggOutput += "\\\n";
        strEggOutput += "/" + getSymbol() + getSymbol() + getSymbol() + getSymbol(); 
        strEggOutput += "\\\n";
        strEggOutput += "|" + getSymbol() + getSymbol() + getSymbol() + getSymbol(); 
        strEggOutput += "|\n\\____/\n"; 

        //Returns string strEggOutput which containts the created Easter Egg.
        return strEggOutput;
    }
    //Constructor for Easter Eggs that are called with a variable.
    public EasterEgg(char pchrSymbol) {
        setSymbol(pchrSymbol);
    }
     //Constructor for Easter Eggs that are called without a variable.
    public EasterEgg() {
        setSymbol('#');
    }

    //Main function to test and run the program.
    public static void main(String[] strArgs) {
        
        //Creates new EasterEgg object
        EasterEgg objEggs = new EasterEgg();

        //Prints out an Easter Egg with the default symbol '#'.
        System.out.print(objEggs);
        //Prints out new Easter Eggs with the default symbols in the ().
        System.out.print(new EasterEgg('^'));
        System.out.print(new EasterEgg('$'));
  
        //Uses the setSymbol function to change the symbol in the EasterEgg and then prints out the Egg.
        objEggs.setSymbol('%');
        System.out.print(objEggs);
        objEggs.setSymbol('@');
        System.out.print(objEggs);
    }
}