//Project 1: Program 1

import java.util.Scanner;

public class DiamondMaker {

    private int intWidth;
    private int intTriangleCounter;
    private Scanner objNumScanner = new Scanner(System.in);
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

    public void setNumTriangles(int pintNumGiven) {
        this.intTriangleCounter = pintNumGiven;

        do{
            //Enter 3 for Project 1 required output.
            System.out.println("Please enter an integer greater than 0 to determine the #  of triangles printed. (Enter 3 to meet Project1 requirements.)");
            intTriangleCounter = objNumScanner.nextInt();
        } while(intTriangleCounter <= 0);
    }

    public int getNumTriangles() {
        return intTriangleCounter;
    }

    public void printTriangle() {
        
        int intNumTriangles = this.getNumTriangles();
        int intNumTrianglesStop = 0;
        int intTop = 1;
        int intBottom = this.getWidth()-2;

        while(intTop < this.getWidth()) {
            
            for(int intTopRows = this.getWidth()/2; intTopRows  >= 0; intTopRows--) {
                            
                intNumTrianglesStop = 0;
            
                while (intNumTrianglesStop <= intNumTriangles) {
                                
                    if(intNumTrianglesStop == 0) {          
                        for(int intSpace = intTopRows+1; intSpace > 0; intSpace--) {
                            System.out.print(" ");
                        }
                        for(int intStars = 1; intStars <= intTop; intStars += 1) {
                            System.out.print("*");
                        }
                        intNumTrianglesStop++;            
                    }
                    else if (intNumTrianglesStop == intNumTriangles && intNumTrianglesStop != 0) {
                        for(int intSpace = intTopRows+1; intSpace > 0; intSpace--) {
                             System.out.print(" ");
                        }        
                        intTop += 2;
                        intNumTrianglesStop++;
                        System.out.print("\n");
                    } 
                    else {
                        for(int intSpace = (intTopRows*2)+1; intSpace > 0; intSpace--) {
                            System.out.print(" ");
                        }
                        for(int intStars = 1; intStars <= intTop; intStars += 1) {
                            System.out.print("*");
                        }
                        intNumTrianglesStop++;
                    }         
                }      
            } 
        }
        for(int intBottomRows = 1; intBottomRows <= this.getWidth()/2; intBottomRows ++) {
            
            intNumTrianglesStop = 0;
            
            while(intNumTrianglesStop <= intNumTriangles){
            
                if(intNumTrianglesStop == 0) {
                    for(int intSpace = 0; intSpace < intBottomRows+1; intSpace++) {
                         System.out.print(" ");
                    }
                    for(int intStars = intBottom; intStars >= 1; intStars -= 1){
                          System.out.print("*");
                    }
                    intNumTrianglesStop++;
                }
                else if(intNumTrianglesStop == intNumTriangles && intNumTrianglesStop != 0) {
                    for(int intSpace = 0; intSpace < intBottomRows+1; intSpace++) {
                        System.out.print(" ");
                    } 
                    intBottom -=2;
                    intNumTrianglesStop++;
                    System.out.print("\n");
                }
                else {
                    for(int intSpace = 0; intSpace < (intBottomRows*2)+1; intSpace++) {
                        System.out.print(" ");
                    }
                    for(int intStars = intBottom; intStars >= 1; intStars -= 1){
                        System.out.print("*");
                    }
                    intNumTrianglesStop++;
                }
            }
        }
    }
    
    public void Diamonds() {
        
        this.printTriangle();
    }

    public static void main(String[] args) {
        
        DiamondMaker objMaker = new DiamondMaker();
        int intReset = 0;

        objMaker.setWidth(intReset);
        objMaker.setNumTriangles(intReset);
        objMaker.Diamonds();
    }
}