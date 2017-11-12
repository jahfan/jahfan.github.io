import java.util.Random;

public class Ship {

    protected String strShipName;
    protected String strShipType;
    protected int intShipYear;
    protected int intSpeed;
    protected String strOutput = "";
    protected static Random shipRandom = new Random();

    public Ship() {

    }

    protected void setShipType(int pintShipType) {

        if(pintShipType >=1 && pintShipType <=49) 
            strShipType = "Ship";
        else if(pintShipType >=50 && pintShipType <=99) 
            strShipType = "CargoShip";
        else 
            strShipType = "CruiseShip";
    }
    protected String getShipType() {
        return strShipType;
    }

    protected void setShipName(String pstrShipName) {
        strShipName = pstrShipName;
    }
    protected String getShipName() {
        return strShipName;
    }

    protected void setShipYear(int pintShipYear) {
        intShipYear = pintShipYear;
    }
    protected int getShipYear() {
        return intShipYear;
    }

    protected int shipSpeed() {
        
        intSpeed = Ship.shipRandom.nextInt(21) + 10;

        return intSpeed;
    }

    public String toString() {

        String strOutput = "";
        
        strOutput += "Ship Type: " + getShipType() 
                   + ", Ship Name: " + getShipName() 
                   + ", Ship Speed " + shipSpeed()                  
                   + ", Ship Year: " + getShipYear();

        return strOutput;
    }
    public static void main(String[] args){

        Ship ship = new Ship();

        ship.setShipName("Shippy");
        System.out.println(ship.getShipName());
        ship.setShipType(5);
        System.out.println(ship.getShipType());
        ship.setShipYear(1994);
        System.out.println(ship.getShipYear());
        System.out.println(ship.toString());
    }
}