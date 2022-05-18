package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static test.Test1.money;

public class Test1 {
    public static int money = 0;
    public static void main(String[] args)  {

        JFrame jFrame = new JFrame();

        jFrame.setLayout(null);

        jFrame.setBounds(0,0,1000,600);

        JButton jButton = new JButton();

        jButton.setBounds(0,0,100,100);

        jButton.addActionListener(new A());

        jFrame.add(jButton);

        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class A implements ActionListener{


    public void actionPerformed(ActionEvent e) {
        money += 10;
        System.out.println(money);
    }
}

