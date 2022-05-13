package listener.mouselistener;

import component.list.InitList;
import component.list.MainList;
import database.Crud;
import javafx.util.Pair;
import pkg.User;

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
