import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.sql.*;
public class StoreStatisticsFrame {
    JFrame statsFrame = new JFrame();

    JPanel goBackOption = new JPanel();
    JPanel statsTitle = new JPanel();
    JPanel sortType = new JPanel();
    JPanel tableDisplay = new JPanel();

    JLabel noItemsAvailableText = new JLabel();
    JLabel statsTitleText = new JLabel("Store statistics");

    JButton goBackButton = new JButton("Go Back");

    JTable allStats;

    public StoreStatisticsFrame() {
        statsFrame.setSize(1200, 1200);
        statsFrame.setTitle("Store statistics");
        statsFrame.setLocationRelativeTo(null);
        statsFrame.getContentPane().setBackground(new Color(0, 0, 0));
        statsFrame.setResizable(false);
        statsFrame.setLayout(null);

        statsTitle.setBounds(0, 0, 1200, 100);
        statsTitle.setBackground(new Color(20,200,100));
        statsTitle.setLayout(null);
        statsTitleText.setForeground(new Color(255, 255, 255));
        statsTitleText.setBounds(500, 20, 300, 50);
        statsTitleText.setFont(new Font("Monospaced", Font.BOLD, 24));
        statsTitle.add(statsTitleText);
        
        tableDisplay.setBounds(350, 100, 500, 450);
        tableDisplay.setBackground(new Color(200, 200, 200));
        goBackOption.setBounds(500, 550, 200, 50);
        goBackOption.setBackground(new Color(20,200,100));
        goBackOption.add(goBackButton);
        getStats();
        
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

    

    class goBackToMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Menu backToMenu = new Menu();
        }
    }
    public void getStats() {
        try {
            allStats = new JTable(25, 2);
            String[] headers = { "Item ID", "Number of purchases"};
            for (int i = 0; i < headers.length; i++) {
                allStats.setValueAt(headers[i], 0, i);

            }
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connectToDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/IMS_Database", "root",
                    "root");
            Statement query = connectToDB.createStatement();
            ResultSet retrievedData = query.executeQuery("select * from stats");
            int i = 0;
            while (retrievedData.next()) {
                allStats.setValueAt(retrievedData.getString(1), i + 1, 0);
                allStats.setValueAt(retrievedData.getString(2), i + 1, 1);
                i++;
            }
            connectToDB.close();
            allStats.setBounds(15, 25, 720, 175);
            tableDisplay.add(allStats);
        }

        catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}