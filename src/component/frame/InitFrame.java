package component.frame;

import component.panel.InitPanel;

import javax.swing.*;

public class InitFrame {
    public static JFrame loginFrame;
    public static JFrame mainFrame;
    public static JFrame personFrame;
    public static JFrame lyricsFrame;

    public void init(){
        LoginFrame loginFrame = new LoginFrame();
        InitFrame.loginFrame = loginFrame.setLoginFrame();

        MainFrame mainFrame = new MainFrame();
        InitFrame.mainFrame = mainFrame.setLoginFrame();
    }

    public void setVisible(){
        loginFrame.setVisible(true);
        mainFrame.setVisible(false);
    }
}
