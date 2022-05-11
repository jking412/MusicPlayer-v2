package component.label;

import javax.swing.*;

public class InitLabel {
    public static JLabel accountLoginLabel;
    public static JLabel passwordLoginLabel;

    public static JLabel backgroundLoginLabel;

    public void init(){
        LoginLabel loginLabel = new LoginLabel();
        accountLoginLabel = loginLabel.setAccountLoginLabel();
        passwordLoginLabel = loginLabel.setPasswordLoginLabel();

        MainLabel mainLabel = new MainLabel();
        backgroundLoginLabel = mainLabel.setBackgroundMainLabel();
    }
}
