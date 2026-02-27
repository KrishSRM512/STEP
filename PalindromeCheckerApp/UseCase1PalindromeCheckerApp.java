package PalindromeCheckerApp;

import javax.swing.*;
import java.awt.*;

public class UseCase1PalindromeCheckerApp extends JWindow {

    public UseCase1PalindromeCheckerApp(int duration) {

        JPanel content = (JPanel) getContentPane();
        content.setBackground(Color.WHITE);
        content.setLayout(new GridLayout(3, 1));

        int width = 500;
        int height = 250;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        setBounds(x, y, width, height);

        JLabel label1 = new JLabel("Welcome to Palindrome Checker Management System", JLabel.CENTER);
        JLabel label2 = new JLabel("Version: 1.0", JLabel.CENTER);
        JLabel label3 = new JLabel("System Initialized Successfully", JLabel.CENTER);

        label1.setFont(new Font("Arial", Font.BOLD, 16));
        label2.setFont(new Font("Arial", Font.PLAIN, 14));
        label3.setFont(new Font("Arial", Font.ITALIC, 13));

        content.add(label1);
        content.add(label2);
        content.add(label3);

        setVisible(true);

        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dispose();
    }

    public static void main(String[] args) {
        new UseCase1PalindromeCheckerApp(5000);
    }
}