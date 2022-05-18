package listener.actionlistener;

import component.button.InitButton;
import pkg.AudioPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMainActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(AudioPlayer.musicLists.size()==0){//如果播放列表没有歌曲，就不播放
            System.out.println("没有歌曲");
            return;
        }

        if(AudioPlayer.flag){//如果有歌曲就先暂停
            AudioPlayer.stop();
            AudioPlayer.flag = false;//设置当前播放状态为false
            InitButton.startMainButton.setText("播放");
            return;
        }

        AudioPlayer.setAudioPlayURL(AudioPlayer.musicLists.get(AudioPlayer.index));//设置播放歌曲的路径

        if(!AudioPlayer.flag){
            AudioPlayer.play();//播放歌曲
            AudioPlayer.flag = true;//设置当前播放状态为true
            InitButton.startMainButton.setText("暂停");
        }
    }
}
