package listener.actionlistener;

import component.button.InitButton;
import pkg.AudioPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextMainActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(AudioPlayer.flag){//如果有歌曲就先暂停
            AudioPlayer.stop();
        }

        AudioPlayer.index = (AudioPlayer.index+1)%AudioPlayer.musicLists.size();//利用取模切换到下一首歌曲
        AudioPlayer.setAudioPlayURL(AudioPlayer.musicLists.get(AudioPlayer.index));//设置歌曲路径

        InitButton.startMainButton.setText("暂停");

        AudioPlayer.play();//播放
        AudioPlayer.flag = true;
    }
}
