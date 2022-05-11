package component;

import component.button.InitButton;
import component.frame.InitFrame;
import component.label.InitLabel;
import component.panel.InitPanel;
import component.passwordfield.InitPasswordField;
import component.textfield.InitTextField;
import musicplayer.Init;

public class InitComponent {
    public void init(){
        InitButton initButton = new InitButton();
        InitFrame initFrame = new InitFrame();
        InitPanel initPanel = new InitPanel();
        InitPasswordField initPasswordField = new InitPasswordField();
        InitTextField initTextField  = new InitTextField();
        InitLabel initLabel = new InitLabel();



        initFrame.init();
        initPanel.init();
        initLabel.init();
        initTextField.init();
        initButton.init();
        initPasswordField.init();
    }
}
