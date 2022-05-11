package component.label;

import component.frame.InitFrame;
import component.frame.LoginFrame;
import component.panel.InitPanel;

import javax.swing.*;

public class LoginLabel {
    public JLabel setAccountLoginLabel(){
        JLabel jLabel = new JLabel("用户名:");

        jLabel.setBounds(LoginFrame.LoginFrameWidth/4,LoginFrame.LoginFrameHeight/4,60,60);

        InitFrame.loginFrame.add(jLabel);

        return jLabel;
    }

    public JLabel setPasswordLoginLabel(){
        JLabel jLabel = new JLabel("密码:");

        jLabel.setBounds(LoginFrame.LoginFrameWidth/4,LoginFrame.LoginFrameHeight/4+60,60,60);

        InitFrame.loginFrame.add(jLabel);

        return jLabel;
    }


}
