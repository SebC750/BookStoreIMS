import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class Menu {

    //This class is where the menu screen that displays the options for all the functionalities of the program. The options are displayed for the employee to choose and each one will lead to a frame to access that functionality.
    //-------------------------------------------------------------------------------------------------------------//

    JFrame menuFrame = new JFrame();

    JPanel menuTitle = new JPanel();
    JPanel salesStatisticsOption = new JPanel();
    JPanel inventoryOption = new JPanel();
    JPanel transactionHistoryOption = new JPanel();
    JPanel logOffOption = new JPanel();

    JLabel menuTitleText = new JLabel("IMS Menu");

    JButton salesStatisticsButton = new JButton("Sales statistics");
    JButton inventoryButton = new JButton("Inventory");
    JButton transactionHistoryButton = new JButton("Transaction History");
    JButton logOffButton = new JButton("Log off");

    public Menu(){
        //Creating the frame for the menu screen.
        //-------------------------------------------------------------------------------------------------------------//
        menuFrame.setSize(500, 500);
        menuFrame.setTitle("IMS Menu");
        menuFrame.setLocationRelativeTo(null);
        menuFrame.getContentPane().setBackground(new Color(0, 0, 0));
        menuFrame.setResizable(false);
        menuFrame.setLayout(null);
        //-------------------------------------------------------------------------------------------------------------//
        
        //Creating the visuals for the components in the frame.
        //-------------------------------------------------------------------------------------------------------------//
        menuTitle.setBackground(new Color(20, 150, 150));
        menuTitle.setLayout(null);
        menuTitle.setBounds(0, 0, 500, 100);
        menuTitleText.setBounds(175,20,200,50);
        menuTitleText.setFont(new Font("Monospaced", Font.BOLD, 30));      
        menuTitleText.setForeground(new Color(255, 255, 255));
        inventoryOption.setBounds(150,150,200,50);
        inventoryOption.setBackground(new Color(150,20,100));
        salesStatisticsOption.setBounds(150, 200, 200, 50);
        salesStatisticsOption.setBackground(new Color(20,200,100));       
        transactionHistoryOption.setBounds(150,250,200,50);
        transactionHistoryOption.setBackground(new Color(20,20,200));
        logOffOption.setBounds(300,400,150,50);
        logOffOption.setBackground(new Color(20, 150, 150));
        
        //-------------------------------------------------------------------------------------------------------------//

        //Add all of the buttons and text into the panels.
        //-------------------------------------------------------------------------------------------------------------//
        menuTitle.add(menuTitleText);
        
        inventoryOption.add(inventoryButton);
        
        salesStatisticsOption.add(salesStatisticsButton);
        
        transactionHistoryOption.add(transactionHistoryButton);

        logOffOption.add(logOffButton);
        //-------------------------------------------------------------------------------------------------------------//

        //Defining the behavior of each button and what frames they will lead to.
        //-------------------------------------------------------------------------------------------------------------//
        ActionListener goToInventory = new goToInventory();
        inventoryButton.addActionListener(goToInventory);
        inventoryButton.setOpaque(false);
        inventoryButton.setContentAreaFilled(false);
        inventoryButton.setBorderPainted(false);
        inventoryButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        inventoryButton.setForeground(Color.WHITE);
        inventoryButton.addActionListener(e -> {
            menuFrame.dispose();
        });
        ActionListener goToStatistics = new goToStatistics();
        salesStatisticsButton.addActionListener(goToStatistics);
        salesStatisticsButton.setOpaque(false);
        salesStatisticsButton.setContentAreaFilled(false);
        salesStatisticsButton.setBorderPainted(false);
        salesStatisticsButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        salesStatisticsButton.setForeground(Color.WHITE);
        salesStatisticsButton.addActionListener(e -> {
            menuFrame.dispose();
        });
        ActionListener goToTransactions = new goToTransactions();
        transactionHistoryButton.addActionListener(goToTransactions);
        transactionHistoryButton.setOpaque(false);
        transactionHistoryButton.setContentAreaFilled(false);
        transactionHistoryButton.setBorderPainted(false);
        transactionHistoryButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        transactionHistoryButton.setForeground(Color.WHITE);
        transactionHistoryButton.addActionListener(e -> {
            menuFrame.dispose();
        });
        ActionListener goBack = new goBackToLogin();
        logOffButton.addActionListener(goBack);
        logOffButton.setOpaque(false);
        logOffButton.setContentAreaFilled(false);
        logOffButton.setBorderPainted(false);
        logOffButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        logOffButton.setForeground(Color.WHITE);
        logOffButton.addActionListener(e -> {
            menuFrame.dispose();
        });

        //-------------------------------------------------------------------------------------------------------------//

        //Compile all the panels and add them to the frame to be displayed.
        //-------------------------------------------------------------------------------------------------------------//
        menuFrame.add(menuTitle);
        menuFrame.add(logOffOption);
        menuFrame.add(inventoryOption);
        menuFrame.add(salesStatisticsOption);      
        menuFrame.add(transactionHistoryOption);
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setVisible(true);
        //-------------------------------------------------------------------------------------------------------------//
    }

    //Each button will lead to their respective frames when clicked.
    //-------------------------------------------------------------------------------------------------------------//
    class goToInventory implements ActionListener{
        public void actionPerformed(ActionEvent e){
              InventoryFrame newInventoryFrame = new InventoryFrame();
        }
    }
    class goToStatistics implements ActionListener{
        public void actionPerformed(ActionEvent e){
              StoreStatisticsFrame newStoreStatistics = new StoreStatisticsFrame();
        }
    }
    class goToTransactions implements ActionListener{
        public void actionPerformed(ActionEvent e){
              TransactionHistoryFrame newTransactionsHistory = new TransactionHistoryFrame();
        }
    }
    class goBackToLogin implements ActionListener{
        public void actionPerformed(ActionEvent e){
              LogInFrame returnToLogIn = new LogInFrame();
        }
    }
    //-------------------------------------------------------------------------------------------------------------//
}
