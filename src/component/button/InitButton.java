package component.button;

import javax.swing.*;

public class InitButton {
    public static JButton signUpLoginButton;
    public static JButton signInLoginButton;
    public static JButton LoginButton;

    public static JButton startMainButton;
    public static JButton nextButton;
    public static JButton preButton;
    public static JButton openFileButton;



    public void init(){
        LoginButton loginButton = new LoginButton();
        signInLoginButton = loginButton.setSignInLoginButton();
        signUpLoginButton = loginButton.setSignUpLoginButton();
        InitButton.LoginButton = loginButton.setLoginButton();

        MainButton mainButton = new MainButton();
        startMainButton = mainButton.setStartMainButton();
        nextButton = mainButton.setNextMainButton();
        preButton = mainButton.setPreMainButton();
        openFileButton = mainButton.setOpenFileMainButton();

    }
}
