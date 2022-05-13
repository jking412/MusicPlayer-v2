package listener.actionlistener;

import component.label.InitLabel;
import component.passwordfield.InitPasswordField;
import component.textfield.InitTextField;
import database.Crud;
import javafx.util.Pair;
import musicplayer.Init;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class SignUpActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = InitTextField.loginTextField.getText();
        String password = Arrays.toString(InitPasswordField.LoginPasswordField.getPassword());

        if(user.isEmpty()||password.isEmpty()){
            InitLabel.messageLoginLabel.setText("账号或密码为空");
            return;
        }

        ArrayList<Pair<String,String>> arrayList;
        arrayList = Crud.selectUser();

        for(int i = 0 ; i < arrayList.size() ; i++){
            if(user.equals(arrayList.get(i).getKey())){
                InitLabel.messageLoginLabel.setText("该账号已存在");
                return;
            }
        }

        Crud.createUser(user,password);
        InitLabel.messageLoginLabel.setText("注册成功");
    }
}
