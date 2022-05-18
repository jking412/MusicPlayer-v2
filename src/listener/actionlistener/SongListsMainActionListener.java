package listener.actionlistener;

import component.list.InitList;
import component.list.MainList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SongListsMainActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(MainList.flag){
            InitList.mainList.setVisible(false);
            MainList.flag = false;
        }else{
//            ArrayList<Pair<String,String>> arrayList = Crud.selectSongLists();
//            for(int i = 0 ; i < arrayList.size() ; i++){
//                if(arrayList.get(i).equals(User.user)){
//                    MainList.arrayData.add(arrayList.get(i).getValue());
//                }
//            }
            InitList.mainList.setVisible(true);
            MainList.flag = true;
        }
    }
}
