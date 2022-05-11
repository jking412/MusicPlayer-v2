package component.frame;

import javax.swing.*;

public class MainFrame {
    public static int MainFrameWidth = 1200;
    public static int MainFrameHeight = 800;

    public JFrame setLoginFrame() {
        JFrame jFrame = new JFrame("主界面");

        jFrame.setLayout(null);

        jFrame.setBounds(100,100,MainFrameWidth,MainFrameHeight);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(false);

        return jFrame;
    }
}
