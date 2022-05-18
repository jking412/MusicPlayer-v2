package component.textfield;

import javax.swing.*;

public class InitTextField {
    public static JTextField loginTextField;

    public static JTextField idTextField;


    public void init(){
        LoginTextField loginTextField = new LoginTextField();
        InitTextField.loginTextField = loginTextField.setLoginTextField();

        IdTextField idTextField = new IdTextField();
        InitTextField.idTextField = idTextField.setIdTextField();
    }
}
