package component.button;

import component.frame.InitFrame;
import component.frame.LoginFrame;
import listener.actionlistener.LoginActionListener;

import javax.swing.*;

public class LoginButton{



    public JButton setSignInLoginButton() {
        JButton jButton = new JButton("登录");

        jButton.setBounds(LoginFrame.LoginFrameWidth/2-200,LoginFrame.LoginFrameHeight-300,60,60);

        InitFrame.loginFrame.add(jButton);

        return jButton;
    }

    public JButton setSignUpLoginButton() {
        JButton jButton = new JButton("注册");

        jButton.setBounds(LoginFrame.LoginFrameWidth/2-100,LoginFrame.LoginFrameHeight-300,60,60);


        InitFrame.loginFrame.add(jButton);


        return jButton;
    }

    public JButton setLoginButton() {
        JButton jButton = new JButton("游客");

        jButton.setBounds(LoginFrame.LoginFrameWidth/2,LoginFrame.LoginFrameHeight-300,60,60);

        jButton.addActionListener(new LoginActionListener());

        InitFrame.loginFrame.add(jButton);


        return jButton;
    }


}
