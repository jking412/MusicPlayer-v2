package component;

import component.comboBox.InitComboBox;
import component.button.InitButton;
import component.frame.InitFrame;
import component.label.InitLabel;
import component.list.InitList;
import component.panel.InitPanel;
import component.passwordfield.InitPasswordField;
import component.textfield.InitTextField;

public class InitComponent {
    public void init(){
        InitButton initButton = new InitButton();
        InitFrame initFrame = new InitFrame();
        InitPanel initPanel = new InitPanel();
        InitPasswordField initPasswordField = new InitPasswordField();
        InitTextField initTextField  = new InitTextField();
        InitLabel initLabel = new InitLabel();
        InitComboBox initComboBox = new InitComboBox();
        InitList initList = new InitList();



        initFrame.init();
        initPanel.init();
        initList.init();
//        initComboBox.init();
        initTextField.init();
        initButton.init();
        initPasswordField.init();
        initLabel.init();

        initFrame.setVisible();
    }
}
