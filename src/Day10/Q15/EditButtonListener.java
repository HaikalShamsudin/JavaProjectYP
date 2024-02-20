package Day10.Q15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;

public class EditButtonListener extends AbstractListener implements ActionListener{

    
    public EditButtonListener(JTextField inputField, JTextField inputDetails, DefaultListModel<Recipe> listModel) {
        super(inputField, inputDetails, listModel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
