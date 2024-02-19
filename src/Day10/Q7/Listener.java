package Day10.Q7;

import javax.swing.JTextField;

abstract class Listener {
    
    private JTextField inputField;

    //CONSTRUCTOR
    public Listener (JTextField inputField) {
        this.inputField = inputField;
    }

    public JTextField getInputField() {
        return inputField;
    }
}
