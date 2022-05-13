package musicplayer;

import database.InitDB;
import pkg.YamlReader;

import javax.swing.*;

public class MusicPlayer {

    public void initMusicPlayer(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        Init init = new Init();
        init.initServer();
    }
}
