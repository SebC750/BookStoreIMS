import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class LogInFrame {
    // Create the components for the JPanel
    // ---------------------------------------------------------------------------------------------//
    ActionListener goToMenu = new ClickListener();

    JFrame logInFrame = new JFrame();

    JPanel logInButtons = new JPanel();
    JPanel titleCard = new JPanel();
    JLabel IMSTitle = new JLabel("Bookstore IMS");
    JLabel signInMessage = new JLabel("Click to sign in.");
    JButton logInButton = new JButton("Log in");

    public LogInFrame() {

        // Generates a log in page for the employee to enter their credentials.
        // ---------------------------------------------------------------------------------------------//

        logInFrame.setSize(500, 500);
        logInFrame.setTitle("Log in page");

        logInFrame.setLocationRelativeTo(null);

        titleCard.setBackground(new Color(20, 150, 150));
        titleCard.setBounds(20, 30, 50, 50);

        IMSTitle.setFont(new Font("Monospaced", Font.BOLD, 24));
        IMSTitle.setForeground(new Color(255, 255, 255));
        logInButtons.setBounds(90, 100, 300, 200);

        signInMessage.setFont(new Font("Monospaced", Font.BOLD, 24));
        signInMessage.setForeground(new Color(30, 50, 190));
        // When the user logs in, it will remove the previous panel and load up a new
        // one. This is so that there aren't multiple frames running at once and to
        // avoid having to delete each one manually. Reduces clutter for the user.
        // ---------------------------------------------------------------------------------------------//
        logInButton.addActionListener(goToMenu);
        logInButton.addActionListener(e -> {
            logInFrame.dispose();
        });

        titleCard.add(IMSTitle);
        logInButtons.add(signInMessage);
        logInButtons.add(logInButton);
        logInFrame.add(logInButtons);
        logInFrame.add(titleCard);
        logInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logInFrame.setVisible(true);
    }

    class ClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Menu newMenu = new Menu();
        }
    }
}
