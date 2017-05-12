/**
 * Class that takes integer and returns their average as a float.
 * @author: Anthony Jackson
 * @version: 1.0
 * */

 /**
  * class that takes integer parameters and returns the average of those parameters as a float
  * @method average(int, int): returns average of params as float
  * @method average(int, int, int): returns average of params as float
  * @method average(int, int, int, int): returns average of params as float
  * */
public class Average {

    /**
     * method that takes two parameter intergers and return average as float
     * @param intNum1, intNum2 integers passed to this method
     * @return the average of the @param nums
     * */
    public float average(int intNum1, int intNum2) {
        float fltAverage = ((float)intNum1 + (float)intNum2) / 2;
        return fltAverage;
    }
    /**
     * method that takes three parameter intergers and returns the average
     * @param intNum1, intNum2, intNum3 integers passed to this method
     * @return the average of the @param nums as a float
     * */
    public float average(int intNum1, int intNum2, int intNum3) {

        float fltAverage = ((float)intNum1 + (float)intNum2 + (float)intNum3) / 3;
        return fltAverage;
    }
    /**
     * method that takes four parameter intergers and returns the average
     * @param intNum1, intNum2, intNum3, intNum4 integers passed to this method
     * @return the average of parameter nums as a float
     * */
    public float average(int intNum1, int intNum2, int intNum3, int intNum4) {

        float fltAverage = ((float)intNum1 + (float)intNum2 + (float)intNum3 + (float)intNum4) / 4;
        return fltAverage;
    }

    public static void main(String [] strArgs) {
        
        //creates new instance of Average class called objAverage
        Average objAverage = new Average();
        
        //Function calls to the different methods of class Average
        System.out.println(objAverage.average(66,13));
        System.out.println(objAverage.average(177, 43, 97));
        System.out.println(objAverage.average(66, 43, 37, 97));
    }
}