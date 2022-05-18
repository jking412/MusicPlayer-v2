package component.button;

import component.frame.InitFrame;
import component.frame.MainFrame;
import listener.actionlistener.*;

import javax.swing.*;
import java.awt.*;

public class MainButton {
    public static String fileName;

    public JButton setStartMainButton(){
        JButton jButton = new JButton();

        jButton.setText("开始");

        jButton.addActionListener(new StartMainActionListener());

        jButton.setForeground(Color.WHITE);

        jButton.setContentAreaFilled(false);

        jButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        jButton.setBounds(MainFrame.MainFrameWidth/2-200,
                MainFrame.MainFrameHeight-150,
                80,80);

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setNextMainButton(){
        JButton jButton = new JButton("下一首");

        jButton.setBounds(MainFrame.MainFrameWidth/2,
                MainFrame.MainFrameHeight-150,
                80,80);

        jButton.addActionListener(new NextMainActionListener());

        jButton.setForeground(Color.WHITE);

        jButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        jButton.setContentAreaFilled(false);

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setPreMainButton(){
        JButton jButton = new JButton("上一首");

        jButton.setBounds(MainFrame.MainFrameWidth/2-400,
                MainFrame.MainFrameHeight-150,
                80,80);

        jButton.addActionListener(new PreMainActionListener());

        jButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        jButton.setForeground(Color.WHITE);

        jButton.setContentAreaFilled(false);

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setOpenFileMainButton(){
        JButton jButton = new JButton("导入歌曲");

        jButton.setBounds(MainFrame.MainFrameWidth-200,
                MainFrame.MainFrameHeight-150,
                80,80);

        jButton.addActionListener(new OpenFileMainActionListener());

        jButton.setForeground(Color.WHITE);

        jButton.setContentAreaFilled(false);

        jButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setSongListsMainButton(){
        JButton jButton = new JButton("歌曲列表");

        jButton.addActionListener(new SongListsMainActionListener());

        jButton.setForeground(Color.WHITE);

        jButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        jButton.setContentAreaFilled(false);

        jButton.setBounds(MainFrame.MainFrameWidth-100,
                MainFrame.MainFrameHeight-150,
                80,80);

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }
}
