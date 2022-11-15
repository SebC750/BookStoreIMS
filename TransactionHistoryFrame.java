import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TransactionHistoryFrame {
    JFrame transactionFrame = new JFrame();

    JPanel historyDisplay = new JPanel();
    JPanel historyTitle = new JPanel();
    JPanel goBackOption = new JPanel();

    JLabel historyTitleText = new JLabel("Transaction History");
    JLabel noItemsAvailableText = new JLabel("No current items");
    JButton goBackButton = new JButton("Go Back");

    JTable allTransactions;
    public TransactionHistoryFrame() {
        transactionFrame.setTitle("Transaction history");
        transactionFrame.setSize(1200, 1200);
        transactionFrame.getContentPane().setBackground(new Color(0, 0, 0));
        transactionFrame.setResizable(false);
        transactionFrame.setLocationRelativeTo(null);
        transactionFrame.setLayout(null);

        historyTitle.setBounds(0, 0, 1200, 100);
        historyTitle.setBackground(new Color(20,20,200));
        historyTitle.setLayout(null);
        historyTitleText.setForeground(new Color(255, 255, 255));
        historyTitleText.setBounds(500, 20, 300, 50);
        historyTitleText.setFont(new Font("Monospaced", Font.BOLD, 24));
        goBackOption.setBounds(500, 550, 200, 50);
        goBackOption.setBackground(new Color(20,20,200));
        historyDisplay.setBounds(350, 100, 500, 450);
        historyDisplay.setBackground(new Color(200, 200, 200));
        historyTitle.add(historyTitleText);
        goBackOption.add(goBackButton);
        
        TransactionList newList = new TransactionList();
        final ArrayList<Transaction> tableTransaction = newList.getAllItems();
        if (tableTransaction.size() == 0) {
            historyDisplay.add(noItemsAvailableText);
        } else {
            allTransactions = new JTable(25, 4);
            String[] headers = { "Transaction ID", "Item Description", "Item Quantity" };
            for (int i = 0; i < headers.length; i++) {
                allTransactions.setValueAt(headers[i], 0, i);

            }
            int x = 25;
            if (tableTransaction.size() < x) {
                x = tableTransaction.size();
            }
            for (int i = 0; i < x; i++) {
                allTransactions.setValueAt(tableTransaction.get(i).getTransactionID(), i + 1, 0);
                allTransactions.setValueAt(tableTransaction.get(i).getPurchasedItem(), i + 1, 1);
                allTransactions.setValueAt(tableTransaction.get(i).getQuantity(), i + 1, 2);

            }
            allTransactions.setBounds(15, 25, 720, 175);
            historyDisplay.add(allTransactions);
        }
        ActionListener goBack = new goBackToMenu();
        goBackButton.addActionListener(goBack);
        goBackButton.setOpaque(false);
        goBackButton.setContentAreaFilled(false);
        goBackButton.setBorderPainted(false);
        goBackButton.setFont(new Font("Monospaced", Font.BOLD, 15));
        goBackButton.setForeground(Color.WHITE);
        goBackButton.addActionListener(e -> {
            transactionFrame.dispose();
        });
        transactionFrame.add(historyDisplay);
        transactionFrame.add(historyTitle);
        transactionFrame.add(goBackOption);
        transactionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        transactionFrame.setVisible(true);
    }
    
    class goBackToMenu implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Menu backToMenu = new Menu();
        }
    }
}
