package component.button;

import component.frame.IdFrame;
import component.frame.InitFrame;
import listener.actionlistener.IdActionListener;

import javax.swing.*;

public class IdButton {
    public JButton setIdButton(){
        JButton jButton = new JButton("提交");

        jButton.setBounds(IdFrame.IdFrameWidth/4,
                IdFrame.IdFrameHeight/3,
                200,60);

        jButton.addActionListener(new IdActionListener());

        InitFrame.idFrame.add(jButton);


        return jButton;
    }
}
