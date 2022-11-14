import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.*;
public class InventoryFrame {
    JFrame inventoryFrame = new JFrame();

    JPanel invTitle = new JPanel();
    JPanel goBackOption = new JPanel();
    JPanel tableDisplay = new JPanel();
    JLabel invTitleText = new JLabel("Inventory");
    JLabel noItemsAvailableText = new JLabel("No items available");
    JTable allInventory;  

    public InventoryFrame(){
        inventoryFrame.setSize(1200,1200);
        inventoryFrame.setTitle("Inventory");
        inventoryFrame.setLocationRelativeTo(null);
        inventoryFrame.getContentPane().setBackground(new Color(0, 0, 0));
        inventoryFrame.setResizable(false);
        inventoryFrame.setLayout(null);

        tableDisplay.setBounds(500,500,500,500);
        tableDisplay.setBackground(new Color(250,250,0));
        Inventory newInv = new Inventory();
        final ArrayList<Item> tableInventory = newInv.getAllItems();
        if(tableInventory.size() == 0){
            tableDisplay.add(invTitleText);
        }
        else{
            
        }
        inventoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inventoryFrame.setVisible(true);

    } 
}
