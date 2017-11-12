import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class ShipGUI extends JPanel implements ActionListener {

    private Scanner lineScan, fileScan;
    private ArrayList<Ship> aryShips = new ArrayList<Ship>();
    private ArrayList<JButton> aryButtons = new ArrayList<JButton>();


    public ShipGUI() {

        
    }

    public void fillArray() throws IOException {
        
        // fileScan = new Scanner(new File("shipnames.dat"));
        // System.out.println(fileScan.nextLine());

        // while(fileScan.hasNextLine()) {
            
        //     System.out.println("test");
        //     System.out.println("test");
        //     String url = fileScan.nextLine();
            
        //     System.out.println(url);
        // }
    }

    public void actionPerformed(ActionEvent e) {

        Object objSource = e.getSource();
    }

    public static void main(String[] strArgs) throws IOException {

        // JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setTitle("Ship Inheiritance");
        // frame.add(new ShipGUI());
        // frame.pack();
        // frame.setVisible(true);

        // ShipGUI ship = new ShipGUI();
        // ship.fillArray();

        Scanner fileScan;

        fileScan = new Scanner(new File("shipnames.dat"));
        System.out.println(fileScan.nextLine());

        while(fileScan.hasNextLine()) {
            

            System.out.println("test");
            String url = fileScan.nextLine();
            
            System.out.println(url);
        }
    }
}