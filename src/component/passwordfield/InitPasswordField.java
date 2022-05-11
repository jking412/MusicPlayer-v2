package component.passwordfield;

import javax.swing.*;

public class InitPasswordField {
    public static JPasswordField LoginPasswordField;

    public void init(){
        LoginPasswordField loginPasswordField = new LoginPasswordField();
        InitPasswordField.LoginPasswordField = loginPasswordField.setLoginPasswordField();
    }
}
