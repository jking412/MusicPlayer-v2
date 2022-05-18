package component.label;

import javax.swing.*;

public class InitLabel {
    public static JLabel accountLoginLabel;
    public static JLabel passwordLoginLabel;
    public static  JLabel messageLoginLabel;
    public static JLabel backgroundLoginLabel;

    public static JLabel backgroundMainLabel;

    public static JLabel idLabel;

    public void init(){
        LoginLabel loginLabel = new LoginLabel();
        accountLoginLabel = loginLabel.setAccountLoginLabel();
        passwordLoginLabel = loginLabel.setPasswordLoginLabel();
        messageLoginLabel = loginLabel.setMessageLoginLabel();
        backgroundLoginLabel = loginLabel.setBackgroundLoginLabel();

        MainLabel mainLabel = new MainLabel();
        backgroundMainLabel = mainLabel.setBackgroundMainLabel();

        IdLabel idLabel = new IdLabel();
        InitLabel.idLabel = idLabel.setIdLabel();




    }
}
