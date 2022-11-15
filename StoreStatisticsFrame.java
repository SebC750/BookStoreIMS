import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class StoreStatisticsFrame {
    JFrame statsFrame = new JFrame();

    JPanel goBackOption = new JPanel();
    JPanel statsTitle = new JPanel();
    JPanel sortType = new JPanel();
    JPanel tableDisplay = new JPanel();

    JLabel noItemsAvailableText = new JLabel();
    JLabel statsTitleText = new JLabel("Store statistics");

    JButton goBackButton = new JButton("Go Back");

    JTable allInventory;

    public StoreStatisticsFrame() {
        statsFrame.setSize(1200, 1200);
        statsFrame.setTitle("Store statistics");
        statsFrame.setLocationRelativeTo(null);
        statsFrame.getContentPane().setBackground(new Color(0, 0, 0));
        statsFrame.setResizable(false);
        statsFrame.setLayout(null);

        statsTitle.setBounds(0, 0, 1200, 100);
        statsTitle.setBackground(new Color(150, 50, 50));
        statsTitle.setLayout(null);
        statsTitleText.setForeground(new Color(255, 255, 255));
        statsTitleText.setBounds(500, 20, 300, 50);
        statsTitleText.setFont(new Font("Monospaced", Font.BOLD, 24));
        statsTitle.add(statsTitleText);
        
        tableDisplay.setBounds(350, 100, 500, 450);
        tableDisplay.setBackground(new Color(200, 200, 200));
        goBackOption.setBounds(500, 550, 200, 50);
        goBackOption.setBackground(new Color(150, 50, 50));
        goBackOption.add(goBackButton);

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
            ActionListener goBack = new goBackToMenu();
            goBackButton.addActionListener(goBack);
            goBackButton.setOpaque(false);
            goBackButton.setContentAreaFilled(false);
            goBackButton.setBorderPainted(false);
            goBackButton.setFont(new Font("Monospaced", Font.BOLD, 15));
            goBackButton.setForeground(Color.WHITE);
            goBackButton.addActionListener(e -> {
                statsFrame.dispose();
            });

            statsFrame.add(statsTitle);
            statsFrame.add(goBackOption);
            statsFrame.add(tableDisplay);
            statsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            statsFrame.setVisible(true);
        }

    }

    class goBackToMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Menu backToMenu = new Menu();
        }
    }
}