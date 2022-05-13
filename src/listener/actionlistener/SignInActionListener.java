package listener.actionlistener;

import component.frame.InitFrame;
import component.label.InitLabel;
import component.label.LoginLabel;
import component.panel.InitPanel;
import component.passwordfield.InitPasswordField;
import component.textfield.InitTextField;
import database.Crud;
import javafx.util.Pair;
import pkg.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class SignInActionListener implements ActionListener {

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
                if(password.equals(arrayList.get(i).getValue())){
                    User.user = user;
                    User.password = password;
                    InitFrame.loginFrame.setVisible(false);
                    InitFrame.mainFrame.setVisible(true);
                }else{
                    InitLabel.messageLoginLabel.setText("密码错误");
                }
                return;
            }
        }

        InitLabel.messageLoginLabel.setText("不存在账号，请注册账号");

    }
}
