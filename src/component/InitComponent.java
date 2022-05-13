package component;

import component.button.InitButton;
import component.frame.InitFrame;
import component.label.InitLabel;
import component.list.InitList;
import component.passwordfield.InitPasswordField;
import component.textPane.InitTextPane;
import component.textfield.InitTextField;

public class InitComponent {
    public void init(){
        InitButton initButton = new InitButton();
        InitFrame initFrame = new InitFrame();
        InitPasswordField initPasswordField = new InitPasswordField();
        InitTextField initTextField  = new InitTextField();
        InitLabel initLabel = new InitLabel();
        InitList initList = new InitList();
        InitTextPane initTextPane = new InitTextPane();



        initFrame.init();
        initList.init();
        initTextPane.init();
        initTextField.init();
        initButton.init();
        initPasswordField.init();
        initLabel.init();

        initFrame.setVisible();
    }
}
