package pkg;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

public class AudioPlayer {
    public static AudioClip audioClip;
    public static boolean flag = false;
    URL url;

    public void setAudioPlayURL(String path){
        try {
            url = new URL(path);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        audioClip = Applet.newAudioClip(url);
    }

    public static void play(){
        audioClip.play();
    }

    public static void stop(){
        audioClip.stop();
    }
}
