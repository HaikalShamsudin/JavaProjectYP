package Day10.Q15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class DeleteButtonListener extends AbstractListener implements ActionListener {

    private JList<Recipe> recipelist;

    // constructor for DeleteButtonListener
    public DeleteButtonListener(JTextField inputField, JTextField inputDetails, DefaultListModel<Recipe> listModel,
            JList<Recipe> recipelist) {
        super(inputField, inputDetails, listModel);
        this.recipelist = recipelist;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectIndex = recipelist.getSelectedIndex();

        if (selectIndex != -1) {
            String recipeName = super.getInputField().getText().trim();
            String recipeDetails = super.getInputDetails().getText().trim();
            
            // calling the method into the database
            MySQLMethod method = new MySQLMethod();
            method.delete(recipeName, recipeDetails);

            super.getListModel().remove(selectIndex);

        } else {
            // Display an error message if no item is selected
            JOptionPane.showMessageDialog(null, "Please select an item to delete.", "No Item Selected",
                    JOptionPane.WARNING_MESSAGE);
        }

    }

}
