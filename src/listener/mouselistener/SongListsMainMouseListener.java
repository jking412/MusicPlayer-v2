package listener.mouselistener;

import component.list.InitList;
import component.list.MainList;
import javafx.util.Pair;
import pkg.User;
import pkg.database.Crud;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class SongListsMainMouseListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        if(MainList.flag){
            InitList.mainList.setVisible(false);
            MainList.flag = false;
        }else{
            ArrayList<Pair<String,String>> arrayList = Crud.selectSongLists();
            for(int i = 0 ; i < arrayList.size() ; i++){
                if(arrayList.get(i).equals(User.user)){
                    MainList.arrayData.add(arrayList.get(i).getValue());
                }
            }
            String[] strings = new String[MainList.arrayData.size()];

            for(int i = 0 ; i < MainList.arrayData.size() ; i++){
                strings[i] = MainList.arrayData.get(i);
            }
            InitList.mainList.setListData(strings);
            InitList.mainList.setVisible(true);
            MainList.flag = true;
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
