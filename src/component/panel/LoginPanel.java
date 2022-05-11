package component.panel;

import component.frame.InitFrame;
import component.frame.LoginFrame;

import javax.swing.*;

public class LoginPanel {

    public JPanel setLoginPanel(){
        JPanel jPanel = new JPanel();

        jPanel.setLayout(null);

        jPanel.setBounds(0,0, LoginFrame.LoginFrameWidth,LoginFrame.LoginFrameHeight);


        jPanel.setVisible(true);

        InitFrame.loginFrame.add(jPanel);

        return jPanel;
    }
}
