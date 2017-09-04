//Project 1: Program 1

import java.util.Scanner;
import java.util.ArrayList;

public class DiamondMakerSimple {

    private int intWidth;
    private Scanner objWidthScanner = new Scanner(System.in);
    
    public void setWidth(int pintWidthGiven) {
        this.intWidth = pintWidthGiven; 
        
        do{
            System.out.println("Please enter an odd integer between 3 and 51 (inclusive) to determine the width of the diamond(s).");
            intWidth = objWidthScanner.nextInt();
        } while(intWidth > 51 || intWidth < 3);

    }

    public int getWidth() {
        return this.intWidth;
    }

    public String printTriangle() {
    
        int intTop = 1;
        int intBottom = this.getWidth()-2;
        String strTriangle = "";

        for(intTop =1; intTop < this.getWidth(); intTop += 2) {
            
            for(int intTopRows = this.getWidth()/2; intTopRows  >= 0; intTopRows--) {
                                    
                for(int intSpace = intTopRows; intSpace > 0; intSpace--) {
                    strTriangle += " ";
                }
                for(int intStars = 1; intStars <= intTop; intStars += 1) {
                    strTriangle += "*";
                }             
                intTop += 2;
                strTriangle += "\n";                 
            } 
        }
        for(int intBottomRows = 1; intBottomRows <= this.getWidth()/2; intBottomRows ++) {
            
            for(int intSpace = 0; intSpace < intBottomRows; intSpace++) {
                strTriangle += " ";
            }
            for(int intStars = intBottom; intStars >= 1; intStars -= 1){
                strTriangle += "*";
            }   
            for(int intSpace = 0; intSpace < intBottomRows; intSpace++) {
                strTriangle += " ";
            } 
            intBottom -=2;
            strTriangle += "\n";  
        }
        return strTriangle;
    }

    public String toString() {
        
        String strOutput = "";
        strOutput += this.printTriangle();

        return strOutput;
    }

    public static void main(String[] args) {
        
        DiamondMaker objMaker = new DiamondMaker();
        int intReset = 0;


        objMaker.setWidth(intReset);
        System.out.println(objMaker.toString());
    }
}
