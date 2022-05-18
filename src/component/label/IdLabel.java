package component.label;

import component.frame.IdFrame;
import component.frame.InitFrame;

import javax.swing.*;
import java.awt.*;

public class IdLabel {
    public JLabel setIdLabel(){
        JLabel jLabel = new JLabel("输入歌曲ID(若未知则输入0):");

        Font font = new Font("宋体",Font.PLAIN,13);

        jLabel.setFont(font);

        jLabel.setBounds(20,20,
                IdFrame.IdFrameWidth/2,
                IdFrame.IdFrameHeight/6);

        InitFrame.idFrame.add(jLabel);

        return jLabel;
    }
}
