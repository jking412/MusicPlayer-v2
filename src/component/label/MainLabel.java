package component.label;

import component.frame.InitFrame;

import javax.swing.*;

public class MainLabel {

    public JLabel setBackgroundMainLabel(){
        JLabel jLabel = new JLabel();

        ImageIcon imageIcon = new ImageIcon("resource/background.jpg");
        jLabel.setIcon(imageIcon);

        jLabel.setBounds(0,0,imageIcon.getIconWidth(),imageIcon.getIconHeight());

        InitFrame.mainFrame.add(jLabel);

        return jLabel;
    }
}
