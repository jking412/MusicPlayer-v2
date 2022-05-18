package component.textPane;

import component.frame.InitFrame;
import component.frame.MainFrame;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

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

        StyleConstants.setForeground(simpleAttributeSet, Color.WHITE);

        jTextPane.setCharacterAttributes(simpleAttributeSet,false);

//        jTextPane.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        jTextPane.setOpaque(false);

        return jTextPane;
    }
}
