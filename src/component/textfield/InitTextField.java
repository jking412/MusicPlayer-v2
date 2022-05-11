package component.textfield;

import musicplayer.Init;

import javax.swing.*;

public class InitTextField {
    public static JTextField loginTextField;

    public void init(){
        LoginTextField loginTextField = new LoginTextField();
        InitTextField.loginTextField = loginTextField.setLoginTextField();
    }
}
