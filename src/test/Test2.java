package test;

import javax.swing.*;
import java.awt.*;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setLayout(null);

        jFrame.setBounds(0,0,1000,600);

        JTextField jTextField = new JTextField();

        JPanel jPanel = new JPanel();

        jTextField.setBounds(0,0,100,100);
        JTextArea jTextArea = new JTextArea(1,10);

        JButton jButton = new JButton("ds");

        jButton.setBounds(0,0,100,100);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\tuyufei\\Desktop\\main\\362b2ce12eddacc0.jpg");
        jButton.setIcon(imageIcon);


//        jPanel.add(jButton);


        jFrame.add(jButton);

        jFrame.setVisible(true);



    }
}
