package component.textfield;

import component.frame.InitFrame;
import component.frame.LoginFrame;

import javax.swing.*;

public class LoginTextField {

    public JTextField setLoginTextField(){
        JTextField jTextField = new JTextField(30);

        jTextField.setBounds(LoginFrame.LoginFrameWidth/4+60,LoginFrame.LoginFrameHeight/4+20,300,30);

        InitFrame.loginFrame.add(jTextField);

        return jTextField;
    }
}
