package component.list;

import component.frame.InitFrame;
import component.frame.MainFrame;
import javafx.util.Pair;
import listener.actionlistener.MainListSelectionListener;
import pkg.User;
import pkg.database.Crud;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainList {
    public static boolean flag;
    public static ArrayList<String> arrayData = new ArrayList<>();

    public JList<String> setMainList(){
        JList<String> jList = new JList<>();

        jList.setBounds(MainFrame.MainFrameWidth*6/7,
                100,
                MainFrame.MainFrameWidth/7,
                MainFrame.MainFrameHeight-300);

        if(!User.user.isEmpty()){
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

        jList.addListSelectionListener(new MainListSelectionListener());

        Font font = new Font("宋体",Font.PLAIN,30);

        jList.setFont(font);

        jList.setOpaque(false);

        jList.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        jList.setVisible(false);

        InitFrame.mainFrame.add(jList);

        return jList;
    }

}
