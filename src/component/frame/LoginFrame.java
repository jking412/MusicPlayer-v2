package component.frame;

import javax.swing.*;

public class LoginFrame {
    public static final int LoginFrameWidth = 1000;
    public static final int LoginFrameHeight = 700;

    public JFrame setLoginFrame() {
        JFrame jFrame = new JFrame("登录界面");

        jFrame.setLayout(null);

        jFrame.setBounds(100,100,LoginFrameWidth,LoginFrameHeight);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);

        return jFrame;
    }
}
