package component.textfield;

import component.frame.IdFrame;
import component.frame.InitFrame;

import javax.swing.*;

public class IdTextField {
    public static String id;

    public JTextField setIdTextField(){
        JTextField jTextField = new JTextField();

        jTextField.setBounds(200,20,
                IdFrame.IdFrameWidth/3,
                IdFrame.IdFrameHeight/6);

        InitFrame.idFrame.add(jTextField);

        return jTextField;
    }
}
