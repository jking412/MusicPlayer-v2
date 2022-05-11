package component.label;

import component.frame.InitFrame;

import javax.swing.*;

public class MainLabel {

    public JLabel setBackgroundMainLabel(){
        JLabel jLabel = new JLabel();

        InitFrame.mainFrame.add(jLabel);

        return jLabel;
    }
}
