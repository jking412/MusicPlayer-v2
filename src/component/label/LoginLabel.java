package component.label;

import component.frame.InitFrame;
import component.frame.LoginFrame;

import javax.swing.*;
import java.awt.*;

public class LoginLabel {
    public JLabel setAccountLoginLabel(){
        JLabel jLabel = new JLabel("用户名:");

        jLabel.setForeground(Color.black);

        jLabel.setBounds(LoginFrame.LoginFrameWidth/4,
                LoginFrame.LoginFrameHeight/4,
                60,60);

        InitFrame.loginFrame.add(jLabel);

        return jLabel;
    }

    public JLabel setPasswordLoginLabel(){
        JLabel jLabel = new JLabel("密码:");

        jLabel.setForeground(Color.black);

        jLabel.setBounds(LoginFrame.LoginFrameWidth/4,
                LoginFrame.LoginFrameHeight/4+60,
                60,60);

        InitFrame.loginFrame.add(jLabel);

        return jLabel;
    }

    public JLabel setMessageLoginLabel(){
        JLabel jLabel = new JLabel("");

        jLabel.setForeground(Color.red);

        jLabel.setBounds(LoginFrame.LoginFrameWidth/4+100,
                LoginFrame.LoginFrameHeight/4+100,200,60);

        InitFrame.loginFrame.add(jLabel);

        return jLabel;
    }

    public JLabel setBackgroundLoginLabel(){
        JLabel jLabel = new JLabel();

        ImageIcon imageIcon = new ImageIcon("images/loginbackground.jpg");
        jLabel.setIcon(imageIcon);

        jLabel.setBounds(0,0,LoginFrame.LoginFrameWidth,LoginFrame.LoginFrameHeight);

//        InitFrame.loginFrame.add(jLabel);

        return jLabel;
    }


}
