package Day9.Q15;

import java.awt.Dimension;

import javax.swing.*;


public class RecipeBookApp extends JFrame { //this class only for GUI panel
    
    private JTextField inputField;
    private JList <Recipe> recipelist;
    private DefaultListModel <Recipe> listModel;

    RecipeBookApp() {

        //basic setup
        setTitle("Recipe List");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //panel interface
        JPanel mainPanel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel displayPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        
        //add label and title input
        JLabel inputLabel = new JLabel("Enter Recipe");
        inputField = new JTextField(20);
        textPanel.add(inputLabel);
        textPanel.add(inputField);

        // add display panel
        listModel = new DefaultListModel<>();
        recipelist = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(recipelist);
        scrollPane.setPreferredSize(new Dimension(250,200));
        displayPanel.add(scrollPane);

        //ADD ADD BUTTON
        JButton addButton = new JButton("Add");
        addButton.addActionListener(null);

        //add all to the main panel
        mainPanel.add(textPanel);
        mainPanel.add(displayPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(addButton);

        add(mainPanel);



    }

}
