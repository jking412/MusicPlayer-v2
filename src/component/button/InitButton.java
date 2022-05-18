package component.button;

import javax.swing.*;

public class InitButton {
    public static JButton signUpLoginButton;
    public static JButton signInLoginButton;
    public static JButton LoginButton;

    public static JButton startMainButton;
    public static JButton nextMainButton;
    public static JButton preMainButton;
    public static JButton openFileMainButton;
    public static JButton songListsMainButton;

    public static JButton idButton;



    public void init(){
        LoginButton loginButton = new LoginButton();
        signInLoginButton = loginButton.setSignInLoginButton();
        InitButton.LoginButton = loginButton.setLoginButton();
        signUpLoginButton = loginButton.setSignUpLoginButton();


        MainButton mainButton = new MainButton();
        startMainButton = mainButton.setStartMainButton();
        nextMainButton = mainButton.setNextMainButton();
        preMainButton = mainButton.setPreMainButton();
        openFileMainButton = mainButton.setOpenFileMainButton();
        songListsMainButton = mainButton.setSongListsMainButton();

        IdButton idButton = new IdButton();
        InitButton.idButton = idButton.setIdButton();

    }
}
