package Day9.java.Example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ExpenseTracker extends JFrame {

    private JTextField expenseField;
    private Jlist expenseList;
    private DefaultListModel listModel;
    
    @SuppressWarnings ("unchecked")
    //constructor
    public ExpenseTracker() {

        //set the name. this need to do
        setTitle("Expense Tracker:");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo

        //create an object
        JPanel panel = new JPanel();

        //textFields
        JPanel inputJPanel = new JPanel();
        JLabel expenseLabel = new JLabel("Expense:");
        expenseField = new JTextField(20);

        //button
        JButton addButton = new JButton("add");
        addButton.addActionListener(new addButtonListener());

        inputJPanel.add(expenseLabel);
        inputJPanel.add(expenseField);
        inputJPanel

        //scroll list
        expenseList = new JList<>(listModel);
        JScrollPane scrollpane = new JScrollPane();

        //delete button
        JButton deleteButton - new JButton("delete");
        


        panel.add(inputJPanel);
        panel.add(scrollpane);
        add(panel);

        private class addButtonListener implements addActionListener {
        
            
        }

    }

    public static void main(String[] args) {

        //call
        SwingUtilities.invokeLater(() -> {
            ExpenseTrackerApp app = new ExpenseTrackerApp();
            app.
        })
    }
}
