package Day9.Q15;

import java.awt.Dimension;

import javax.swing.*;


public class RecipeBookApp extends JFrame { //this class only for GUI panel
    
    private JTextField inputField;
    private JTextField inputDetails;
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
        JPanel detailPanel = new JPanel();
        
        //add label and title input
        JLabel inputLabel = new JLabel("Enter Recipe");
        inputField = new JTextField(20);
        textPanel.add(inputLabel);
        textPanel.add(inputField);

        //add label and details recipe
        JLabel detaiLabel = new JLabel("Enter recipe details");
        inputDetails = new JTextField(20);
        detailPanel.add(detaiLabel);
        detailPanel.add(inputDetails);
        
        // add display panel
        listModel = new DefaultListModel<>();
        recipelist = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(recipelist);
        scrollPane.setPreferredSize(new Dimension(250,200));
        displayPanel.add(scrollPane);

        //ADD ADD BUTTON
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener(inputField, inputDetails, listModel));

        // ADD DELETE BUTTON
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener(inputField, inputDetails, listModel, recipelist));
        buttonPanel.add(deleteButton);

        //add all to the main panel
        mainPanel.add(textPanel);
        mainPanel.add(displayPanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(addButton);
        mainPanel.add(detailPanel);

        add(mainPanel);



    }

}
