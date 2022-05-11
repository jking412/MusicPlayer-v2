package component.passwordfield;

import component.frame.InitFrame;
import component.frame.LoginFrame;
import component.panel.InitPanel;

import javax.swing.*;

public class LoginPasswordField {

    public JPasswordField setLoginPasswordField(){
        JPasswordField jPasswordField = new JPasswordField(30);

        jPasswordField.setBounds(LoginFrame.LoginFrameWidth/4+60,LoginFrame.LoginFrameHeight/4+80,300,30);

        jPasswordField.setEchoChar('*');

        InitFrame.loginFrame.add(jPasswordField);

        return jPasswordField;
    }
}
