package Day10.Q15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddButtonListener extends AbstractListener implements ActionListener {

    //constructor for AddButtonListener
    public AddButtonListener(JTextField inputField, JTextField inputDetails, DefaultListModel <Recipe> listModel){
        super(inputField, inputDetails, listModel);
    }
    
    //method for add button
    @Override
    public void actionPerformed(ActionEvent e) {
        String recipeName = super.getInputField().getText().trim();
        String recipeDetails = super.getInputDetails().getText().trim();

        //calling the method into the database
        MySQLMethod method = new MySQLMethod();
        method.insert(recipeName, recipeDetails);

        if (!recipeName.isEmpty() && !recipeDetails.isEmpty()) {
            Recipe recipeObj = new Recipe(recipeName, recipeDetails);
            super.getListModel().addElement(recipeObj);
            super.getInputField().setText("");
            super.getInputDetails().setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid recipe name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



   
    
}
