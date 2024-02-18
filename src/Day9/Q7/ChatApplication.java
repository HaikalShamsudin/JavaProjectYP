package Day9.Q7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


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

        //action listener for the send button
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        //action listener for pressing ENTER in the message field
        messageField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
                autoReply(); 
            }
        });

    }
    //method send message
    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            chatArea.append ("You:" + message + "\n");
            messageField.setText(""); //clear the message field
        }
    }

    //method auto reply
    private void autoReply() {
        String firstMessage = chatArea.getText().trim();
        if (firstMessage.endsWith("Hello")){
            chatArea.append("Auto Reply: Hello! how can I help you?\n");
        }
        if (firstMessage.endsWith("How Are You")){
            chatArea.append("Auto Reply: I'm fine, thank you\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ChatApplication().setVisible(true);
            }
        });
    }


}
