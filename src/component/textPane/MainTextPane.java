package component.textPane;

import component.frame.InitFrame;
import component.frame.MainFrame;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class MainTextPane {
    public JTextPane setMainTextPane(){
        JTextPane jTextPane = new JTextPane();

        jTextPane.setBounds(MainFrame.MainFrameWidth/6,
                MainFrame.MainFrameHeight/16,
                MainFrame.MainFrameWidth/2,
                MainFrame.MainFrameHeight/4*3);

        InitFrame.mainFrame.add(jTextPane);

        SimpleAttributeSet simpleAttributeSet=new SimpleAttributeSet();

        StyleConstants.setFontSize(simpleAttributeSet,20);

        jTextPane.setCharacterAttributes(simpleAttributeSet,false);

        return jTextPane;
    }
}
