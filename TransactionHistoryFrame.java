import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class TransactionHistoryFrame {
    JFrame transactionFrame = new JFrame();

    JPanel historyDisplay = new JPanel();
    JPanel historyTitle = new JPanel();
    JPanel goBackOption = new JPanel();

    JLabel historyTitleText = new JLabel("Transaction History");

    JButton goBackButton = new JButton("Go Back");

    public TransactionHistoryFrame() {
        transactionFrame.setTitle("Transaction history");
        transactionFrame.setSize(1200, 1200);
        transactionFrame.getContentPane().setBackground(new Color(0, 0, 0));
        transactionFrame.setResizable(false);
        transactionFrame.setLocationRelativeTo(null);
        transactionFrame.setLayout(null);

        historyTitle.setBounds(0, 0, 1200, 100);
        historyTitle.setBackground(new Color(150, 50, 50));
        historyTitle.setLayout(null);
        historyTitleText.setForeground(new Color(255, 255, 255));
        historyTitleText.setBounds(500, 20, 300, 50);
        historyTitleText.setFont(new Font("Monospaced", Font.BOLD, 24));
        goBackOption.setBounds(500, 550, 200, 50);
        goBackOption.setBackground(new Color(150, 50, 50));

        historyTitle.add(historyTitleText);
        goBackOption.add(goBackButton);

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
