package component.frame;


import javax.swing.*;

public class InitFrame {
    public static JFrame loginFrame;
    public static JFrame mainFrame;
    public static JFrame personFrame;
    public static JFrame lyricsFrame;

    public static JFrame idFrame;

    public void init(){
        LoginFrame loginFrame = new LoginFrame();
        InitFrame.loginFrame = loginFrame.setLoginFrame();

        MainFrame mainFrame = new MainFrame();
        InitFrame.mainFrame = mainFrame.setLoginFrame();

        IdFrame idFrame = new IdFrame();
        InitFrame.idFrame = idFrame.setIdFrame();
    }

    public void setVisible(){
        loginFrame.setVisible(true);
        mainFrame.setVisible(false);
        idFrame.setVisible(false);
    }
}
