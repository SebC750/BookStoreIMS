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

    JButton goBackButton = new JButton("Go back");
    JTable allInventory;

    public InventoryFrame() {
        inventoryFrame.setSize(1200, 1200);
        inventoryFrame.setTitle("Inventory");
        inventoryFrame.setLocationRelativeTo(null);
        inventoryFrame.getContentPane().setBackground(new Color(0, 0, 0));
        inventoryFrame.setResizable(false);
        inventoryFrame.setLayout(null);

        invTitle.setBounds(0, 0, 1200, 100);
        invTitle.setBackground(new Color(150, 50, 50));
        invTitle.setLayout(null);
        invTitleText.setForeground(new Color(255, 255, 255));
        invTitleText.setBounds(550, 20, 300, 50);
        invTitleText.setFont(new Font("Monospaced", Font.BOLD, 24));
        goBackOption.setBounds(500, 550, 200, 50);
        goBackOption.setBackground(new Color(150, 50, 50));
        invTitle.add(invTitleText);
        goBackOption.add(goBackButton);
        tableDisplay.setBounds(350, 100, 500, 450);
        tableDisplay.setBackground(new Color(200, 200, 200));
        
        Inventory newInv = new Inventory();
        final ArrayList<Item> tableInventory = newInv.getAllItems();
        if (tableInventory.size() == 0) {
            tableDisplay.add(noItemsAvailableText);
        } else {
            allInventory = new JTable(25, 4);
            String[] headers = { "Item ID", "Item name", "Item price", "Item Quantity" };
            for (int i = 0; i < headers.length; i++) {
                allInventory.setValueAt(headers[i], 0, i);

            }
            int x = 25;
            if (tableInventory.size() < x) {
                x = tableInventory.size();
            }
            for (int i = 0; i < x; i++) {
                allInventory.setValueAt(tableInventory.get(i).getID(), i + 1, 0);
                allInventory.setValueAt(tableInventory.get(i).getName(), i + 1, 1);
                allInventory.setValueAt(tableInventory.get(i).getPrice(), i + 1, 2);
                allInventory.setValueAt(tableInventory.get(i).getQuantity(), i + 1, 3);

            }
            allInventory.setBounds(15, 25, 720, 175);
            tableDisplay.add(allInventory);
        }
        ActionListener goBack = new goBackToMenu();
        goBackButton.addActionListener(goBack);
        goBackButton.setOpaque(false);
        goBackButton.setContentAreaFilled(false);
        goBackButton.setBorderPainted(false);
        goBackButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        goBackButton.setForeground(Color.WHITE);
        goBackButton.addActionListener(e -> {
            inventoryFrame.dispose();
        });

        inventoryFrame.add(invTitle);
        inventoryFrame.add(tableDisplay);
        inventoryFrame.add(goBackOption);
        inventoryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inventoryFrame.setVisible(true);

    }

    class goBackToMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Menu backToMenu = new Menu();
        }
    }
}
