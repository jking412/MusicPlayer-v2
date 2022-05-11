package listener.actionlistener;

import component.frame.InitFrame;
import component.frame.LoginFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        InitFrame.loginFrame.setVisible(false);
        InitFrame.mainFrame.setVisible(true);
    }
}
