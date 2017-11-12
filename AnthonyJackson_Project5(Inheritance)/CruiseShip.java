import java.util.Random;

public class CruiseShip extends Ship {
 
    private int intPassengerCapacity;

    public CruiseShip() {

    }
    
    public void setPassengerCapacity(int pintPassengerCapacity) {
        intPassengerCapacity = pintPassengerCapacity;
    }
    public int getPassengerCapacity() {
        return intPassengerCapacity;
    }

    public int shipSpeed() {
        
        intSpeed = Ship.shipRandom.nextInt(36) + 5;

        return intSpeed;
    }

    public String toString() {

        strOutput += "Ship Type: " + getShipType() 
                   + ", Ship Name: " + getShipName() 
                   + ", Ship Speed " + shipSpeed()         
                   + ", Passenger Capacity: " + getPassengerCapacity();         

        return strOutput;
    }

    public static void main(String[] args){

        CruiseShip ship = new CruiseShip();

        ship.setShipName("Shippy");
        System.out.println(ship.getShipName());
        ship.setShipType(157);
        System.out.println(ship.getShipType());
        ship.setPassengerCapacity(1334);
        System.out.println(ship.getPassengerCapacity());
        System.out.println(ship.toString());
    }
}