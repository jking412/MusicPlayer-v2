package component.button;

import component.frame.InitFrame;
import component.frame.MainFrame;
import listener.actionlistener.NextMainActionListener;
import listener.actionlistener.OpenFileMainActionListener;
import listener.actionlistener.PreMainActionListener;
import listener.actionlistener.StartMainActionListener;
import listener.mouselistener.SongListsMainMouseListener;
import main.Main;

import javax.swing.*;

public class MainButton {
    public JButton setStartMainButton(){
        JButton jButton = new JButton();

        jButton.addActionListener(new StartMainActionListener());

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setNextMainButton(){
        JButton jButton = new JButton();

        jButton.addActionListener(new NextMainActionListener());

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setPreMainButton(){
        JButton jButton = new JButton();

        jButton.addActionListener(new PreMainActionListener());

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setOpenFileMainButton(){
        JButton jButton = new JButton();

        jButton.addActionListener(new OpenFileMainActionListener());

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }

    public JButton setSongListsMainButton(){
        JButton jButton = new JButton();

        jButton.addMouseListener(new SongListsMainMouseListener());

        jButton.setBounds(MainFrame.MainFrameWidth-100,
                MainFrame.MainFrameHeight-100,
                50,50);

        InitFrame.mainFrame.add(jButton);

        return jButton;
    }
}
