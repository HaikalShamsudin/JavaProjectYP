package Day10.Q7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SendMessage extends Listener implements ActionListener {

    private JTextArea chatArea;
    
    public SendMessage(JTextField inputField) {
        super(inputField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = super.getInputField().getText(); 

        if (!message.isEmpty()) {
            chatArea.append("You:" + message + "\n");
            getInputField().setText(""); //clear the message field
        }
    }
    
}