import java.util.Random;

public class CargoShip extends Ship {

    private int intCargoCapacity;

    public CargoShip() {

    }

    public void setCargoCapacity(int pintCargoCapacity) {
        intCargoCapacity = pintCargoCapacity;
    }
    public int getCargoCapacity() {
        return intCargoCapacity;
    }

    public int shipSpeed() {
        
        intSpeed = Ship.shipRandom.nextInt(56) + 5;
        
        return intSpeed;
    }

    public String toString() {

        strOutput += "Ship Type: " + getShipType() 
                   + ", Ship Name: " + getShipName() 
                   + ", Ship Speed " + shipSpeed()         
                   + ", Cargo Capacity: " + getCargoCapacity();         

        return strOutput;
    }

    public static void main(String[] args){

        CargoShip ship = new CargoShip();

        ship.setShipName("Shippy");
        System.out.println(ship.getShipName());
        ship.setShipType(57);
        System.out.println(ship.getShipType());
        ship.setCargoCapacity(1334);
        System.out.println(ship.getCargoCapacity());
        System.out.println(ship.toString());
    }
}