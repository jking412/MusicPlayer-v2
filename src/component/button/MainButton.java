package component.button;

import component.frame.InitFrame;
import component.frame.MainFrame;
import listener.actionlistener.NextMainActionListener;
import listener.actionlistener.OpenFileMainActionListener;
import listener.actionlistener.PreMainActionListener;
import listener.actionlistener.StartMainActionListener;
import listener.mouselistener.SongListsMainMouseListener;

import javax.swing.*;

public class MainButton {
    public static String fileName;

    public JButton setStartMainButton(){
        JButton jButton = new JButton();

        jButton.setText("开始");

        jButton.addActionListener(new StartMainActionListener());

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

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setPreMainButton(){
        JButton jButton = new JButton("上一首");

        jButton.setBounds(MainFrame.MainFrameWidth/2-400,
                MainFrame.MainFrameHeight-150,
                80,80);

        jButton.addActionListener(new PreMainActionListener());

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setOpenFileMainButton(){
        JButton jButton = new JButton("导入歌曲");

        jButton.setBounds(MainFrame.MainFrameWidth-200,
                MainFrame.MainFrameHeight-150,
                80,80);

        jButton.addActionListener(new OpenFileMainActionListener());

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setSongListsMainButton(){
        JButton jButton = new JButton("歌曲列表");

        jButton.addMouseListener(new SongListsMainMouseListener());

        jButton.setBounds(MainFrame.MainFrameWidth-100,
                MainFrame.MainFrameHeight-150,
                80,80);

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }
}
