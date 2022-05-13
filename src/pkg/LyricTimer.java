package pkg;

import component.textPane.InitTextPane;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class LyricTimer {
    public static Timer timer;

    public static void lyricTimer(String[] lyrics,int[] breakTime){
        if(timer != null){
            timer.cancel();
        }

        Document document = InitTextPane.MainTextPane.getDocument();

        for(int i = 0 ; i < lyrics.length ; i++){
            try {
                document.insertString(document.getLength(),lyrics[i],new SimpleAttributeSet());
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
        }

        timer = new Timer();
        timer.schedule(new Task(lyrics,breakTime),0L,1000L);

    }
}

class Task extends TimerTask{
    int playTime;
    int index;
    String[] lyrics;
    int[] breakTime;

    public Task(String[] lyrics, int[] breakTime) {
        this.lyrics = lyrics;
        this.breakTime = breakTime;
    }

    @Override
    public void run() {
        playTime++;
        if (playTime > breakTime[breakTime.length-1]+3){
            LyricTimer.timer.cancel();
            return;
        }
        SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
        StyleConstants.setFontFamily(simpleAttributeSet, "隶书");
        StyleConstants.setFontSize(simpleAttributeSet,20);
        StyleConstants.setForeground(simpleAttributeSet, Color.yellow);
        StyleConstants.setBold(simpleAttributeSet, true);
    }
}
