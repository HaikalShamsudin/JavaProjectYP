package Day10.Q15;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;



abstract class AbstractListener  {
    
    //declare the variable
    private JTextField inputField;
    private JTextField inputDetails;
    private DefaultListModel <Recipe> listModel;

    //constructor for AbstractListener class
    public AbstractListener(JTextField inputField, JTextField inputDetails, DefaultListModel <Recipe> listModel) {
        this.inputField = inputField;
        this.inputDetails = inputDetails;
        this.listModel = listModel;
    }

    //make method getInputField
    public JTextField getInputField() {
        return inputField;
    }

    //make method getInputDetails
    public JTextField getInputDetails() {
        return inputDetails;
    }

    //make method getListModel
    public DefaultListModel<Recipe> getListModel() {
        return listModel;
    }
}
