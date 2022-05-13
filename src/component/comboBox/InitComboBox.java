package component.comboBox;

import javax.swing.*;

public class InitComboBox {
    public static JComboBox<String> mainComboBox;

    public void init(){
        MainComboBox mainComboBox = new MainComboBox();
        InitComboBox.mainComboBox = mainComboBox.setMainComboBox();
    }
}
