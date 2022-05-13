package component.list;

import component.label.InitLabel;

import javax.swing.*;

public class InitList {
    public static JList<String> mainList;

    public void init(){
        MainList mainList = new MainList();
        InitList.mainList = mainList.setMainList();
    }
}
