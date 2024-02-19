package Day10.Q7;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatApplication extends JFrame {
    private JTextArea chatArea;
    private JTextField messageField;

    //build and interface
    public ChatApplication() {
        setTitle("My Chat App");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //initialize components
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        
        messageField = new JTextField();
        JButton sendButton = new JButton("Send");

        //set layout
        setLayout(new BorderLayout());
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(messageField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        add(bottomPanel, BorderLayout.SOUTH);
    }
}
