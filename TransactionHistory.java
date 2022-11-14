import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
public class TransactionHistory {
    JFrame transactionFrame = new JFrame();

    JPanel historyDisplay = new JPanel();
    JPanel historyTitle = new JPanel();
    JPanel goBackOption = new JPanel();
    
    JLabel historyTitleText = new JLabel("Transaction History");
    
    JButton goBackButton = new JButton("Go Back");
    
    public TransactionHistory(){
          transactionFrame.setTitle("Transaction history");
          transactionFrame.setSize(1200,1200);
          transactionFrame.getContentPane().setBackground(new Color(0,0,0));
          transactionFrame.setResizable(false);
          transactionFrame.setLocationRelativeTo(null);


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

          transactionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          transactionFrame.setVisible(true);
    }
    class goBackToMenu implements ActionListener{
        public void actionPerformed(ActionEvent e){

        }
    }
}
