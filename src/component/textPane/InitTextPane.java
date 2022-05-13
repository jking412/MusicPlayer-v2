package component.textPane;

import javax.swing.*;

public class InitTextPane {
    public static JTextPane MainTextPane;

    public void init(){
        MainTextPane mainTextPane = new MainTextPane();
        InitTextPane.MainTextPane = mainTextPane.setMainTextPane();
    }
}
