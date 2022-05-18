package listener.actionlistener;

import component.list.InitList;
import pkg.AudioPlayer;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainListSelectionListener implements ListSelectionListener {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(AudioPlayer.flag){
            AudioPlayer.stop();
        }

        for(int i = 0 ; i < AudioPlayer.musicLists.size() ; i++){
            if(AudioPlayer.musicLists.get(i).contains(InitList.mainList.getSelectedValue())){
                AudioPlayer.index = i;
                AudioPlayer.setAudioPlayURL(AudioPlayer.musicLists.get(i));
                AudioPlayer.play();
                AudioPlayer.flag = true;
                break;
            }
        }
    }
}
