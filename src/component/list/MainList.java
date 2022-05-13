package component.list;

import component.frame.InitFrame;
import component.frame.MainFrame;
import database.Crud;
import javafx.util.Pair;
import main.Main;
import pkg.User;

import javax.swing.*;
import java.util.ArrayList;

public class MainList {
    public static boolean flag;

    public JList<String> setMainList(){
        JList<String> jList = new JList<>();

        jList.setBounds(MainFrame.MainFrameWidth*3/4,
                0,
                MainFrame.MainFrameWidth/4,
                MainFrame.MainFrameHeight-100);

        if(!User.user.isEmpty()){
                ArrayList<String> arrayData = new ArrayList<>();
                ArrayList<Pair<String,String>> arrayList = Crud.selectSongLists();
                for(int i = 0 ; i < arrayList.size() ; i++){
                    if(arrayList.get(i).equals(User.user)){
                        arrayData.add(arrayList.get(i).getValue());
                    }
                }
                String[] strings = new String[arrayData.size()];

                for(int i = 0 ; i < arrayData.size() ; i++){
                    strings[i] = arrayData.get(i);
                }

                InitList.mainList.setListData(strings);
        }

        jList.setVisible(false);

        InitFrame.mainFrame.add(jList);

        return jList;
    }

}
