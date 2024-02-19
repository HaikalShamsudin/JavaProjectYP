package Day10.Q7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AutoReply extends Listener implements ActionListener {

    private JTextArea chatArea;

    //CONSTRUCTOR
    public AutoReply (JTextField inputField){
        super(inputField);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String firstMessage = chatArea.getText().trim();
        if (firstMessage.endsWith("Hello")){
            chatArea.append("Auto Reply: Hello! how can I help you?\n");
        }
        if (firstMessage.endsWith("How Are You")){
            chatArea.append("Auto Reply: I'm fine, thank you\n");
        }
    } 
}
    
