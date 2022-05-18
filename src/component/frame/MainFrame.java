package component.frame;

import javax.swing.*;

public class MainFrame {
    public static int MainFrameWidth = 1800;
    public static int MainFrameHeight = 1000;

    public JFrame setLoginFrame() {
        JFrame jFrame = new JFrame("主界面");

        jFrame.setLayout(null);

        jFrame.setBounds(50,30,MainFrameWidth,MainFrameHeight);

        jFrame.setVisible(false);

        return jFrame;
    }
}
