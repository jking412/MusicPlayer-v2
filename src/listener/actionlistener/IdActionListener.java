package listener.actionlistener;

import component.button.MainButton;
import component.frame.InitFrame;
import component.textfield.InitTextField;
import pkg.AudioPlayer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IdActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        AudioPlayer.musicId.put(MainButton.fileName,InitTextField.idTextField.getText());
        InitFrame.idFrame.setVisible(false);
    }
}
