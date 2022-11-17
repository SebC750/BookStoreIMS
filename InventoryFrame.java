import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.sql.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InventoryFrame {
    JFrame inventoryFrame = new JFrame();

    JPanel invTitle = new JPanel();
    JPanel goBackOption = new JPanel();
    JPanel tableDisplay = new JPanel();
    JPanel showData = new JPanel();
    JPanel addItemDisplay = new JPanel();

    JLabel invTitleText = new JLabel("Inventory");
    JLabel noItemsAvailableText = new JLabel("No items available");
    

    JButton goBackButton = new JButton("Go back");
   
    JButton addItemButton = new JButton("Add item");
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
        
       
        getInventory();
        
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
    /* 
    public void readCSVFile(String s) throws IOException{
        ArrayList<Item> importData = new ArrayList<Item>();
        Path pathToCSV = Paths.get(s);
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("CSVDemo.csv"));  
            while ((line = br.readLine()) != null)   
{  
            String[] item = line.split(",");
            System.out.println("")
        }
    }
         catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    
    }
    */
class addNewItem implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        try {
            
        } catch (Exception e1) {
            // TODO: handle exception
        }
    }
}
    public void getInventory() {
        try {
            allInventory = new JTable(25, 4);
            String[] headers = { "Item ID", "Item name", "Item price", "Item Quantity" };
            for (int i = 0; i < headers.length; i++) {
                allInventory.setValueAt(headers[i], 0, i);

            }
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connectToDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMS_Database", "root",
                    "root");
            Statement query = connectToDB.createStatement();
            ResultSet retrievedData = query.executeQuery("select * from item");
            int i = 0;
            while (retrievedData.next()) {
                allInventory.setValueAt(retrievedData.getString(1), i + 1, 0);
                allInventory.setValueAt(retrievedData.getString(2), i + 1, 1);
                allInventory.setValueAt(retrievedData.getString(3), i + 1, 2);
                allInventory.setValueAt(retrievedData.getString(4), i + 1, 3);
                i++;
            }
            connectToDB.close();
            allInventory.setBounds(15, 25, 720, 175);
            tableDisplay.add(allInventory);
        }

        catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
