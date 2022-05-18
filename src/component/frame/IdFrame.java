package component.frame;

import javax.swing.*;

public class IdFrame {
    public static int IdFrameWidth = 400;
    public static int IdFrameHeight = 200;

    public JFrame setIdFrame(){
        JFrame jFrame = new JFrame();

        jFrame.setLayout(null);

        jFrame.setBounds(500,500,
                IdFrameWidth,
                IdFrameHeight);


        return jFrame;
    }
}
