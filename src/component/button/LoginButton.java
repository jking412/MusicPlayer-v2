package component.button;

import component.frame.InitFrame;
import component.frame.LoginFrame;
import listener.actionlistener.LoginActionListener;
import listener.actionlistener.SignInActionListener;
import listener.actionlistener.SignUpActionListener;

import javax.swing.*;

public class LoginButton{



    public JButton setSignInLoginButton() {
        JButton jButton = new JButton("登录");

        jButton.setBounds(LoginFrame.LoginFrameWidth/2-200,LoginFrame.LoginFrameHeight-300,300,60);

        jButton.addActionListener(new SignInActionListener());

        InitFrame.loginFrame.add(jButton);

        return jButton;
    }

    public JButton setSignUpLoginButton() {
        JButton jButton = new JButton("用户注册");

        jButton.setBounds(50,LoginFrame.LoginFrameHeight-150,100,60);

        jButton.addActionListener(new SignUpActionListener());

        jButton.setContentAreaFilled(false);
        jButton.setBorderPainted(false);


        InitFrame.loginFrame.add(jButton);


        return jButton;
    }

    public JButton setLoginButton() {
        JButton jButton = new JButton("游客");

        jButton.setBounds(LoginFrame.LoginFrameWidth-150,LoginFrame.LoginFrameHeight-150,60,60);

        jButton.addActionListener(new LoginActionListener());

        InitFrame.loginFrame.add(jButton);


        return jButton;
    }


}
