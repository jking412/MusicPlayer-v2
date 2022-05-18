package pkg;

import component.textPane.InitTextPane;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AudioPlayer {
    public static AudioClip audioClip;
    public static boolean flag = false;
    public static ArrayList<String> musicLists = new ArrayList<>();
    public static Map<String,String> musicId = new HashMap<>();
    public static int index = 0;
    static URL url;
    static String path;

    public static void setAudioPlayURL(String path){
        AudioPlayer.path = path;
        try {
            url = new URL(path);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        audioClip = Applet.newAudioClip(url);
    }

    public static void play(){
        audioClip.play();
        for(String song : AudioPlayer.musicId.keySet()){
            if(AudioPlayer.path.contains(song)){
                if(!musicId.get(song).equals("0")){
                    InitTextPane.MainTextPane.setText(pkg.http.Get.sendGet(musicId.get(song)));
                }
                break;
            }
        }
    }

    public static void stop(){
        audioClip.stop();
    }
}
