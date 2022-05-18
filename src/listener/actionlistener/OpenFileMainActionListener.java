package listener.actionlistener;

import component.button.MainButton;
import component.frame.InitFrame;
import component.list.MainList;
import pkg.AudioPlayer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenFileMainActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FileDialog fileDialog = new FileDialog(new Frame());//打开文件的一个显示框
        fileDialog.setVisible(true);


        if(fileDialog.getFile() != null){//不为空就把文件添加进播放列表(要wav才行)
            System.out.println(fileDialog.getDirectory()+fileDialog.getFile());
            AudioPlayer.musicLists.add("file:"+fileDialog.getDirectory()+fileDialog.getFile());
            MainButton.fileName = fileDialog.getFile();
            InitFrame.idFrame.setVisible(true);
        }else{
            return;
        }

        int index = fileDialog.getFile().indexOf('.');
        MainList.arrayData.add(fileDialog.getFile().substring(0,index));
    }
}
