package Day10.Q3;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

abstract class ToDoListManager extends JFrame {
    public JTextField taskTextField; //This variable is likely used to get user input for adding tasks to the todo list
    public JList <String> todoList; // it's a list that will contain strings representing tasks.
    public DefaultListModel <String> todoListModel; //model for a list component and is used to manage the data (tasks in this case) displayed in the JList.
    

    //constructor 
    public void TodoListManager() {
        setTitle ("To Do List");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //creating object for the panel
        JPanel panel = new JPanel();

        //begin with the user interface
        
        //textField
        JPanel inputJPanel = new JPanel();
        JLabel todoLabel = new JLabel("Task");
        taskTextField = new JTextField(20);


        //add button
        
        JButton addButton = new JButton("Add task");
        addButton.addActionListener(e -> addTask());
        panel.add(todoLabel);
        panel.add(taskTextField);
        panel.add(addButton);
        add(panel);

        //scroll list
        todoListModel = new DefaultListModel<>();
        todoList = new JList <> (todoListModel);
        JScrollPane scrollPane = new JScrollPane(todoList);

        //complete button
                                                                        //This line creates a new JButton instance with the label "Mark as Completed".
        JButton completeButton = new JButton(" Mark as Completed"); // This button will be used to trigger the action of marking a task as completed.
        completeButton.addActionListener(e -> markAsCompleted()); //create a new instance of the. 
        panel.add(inputJPanel); 
        panel.add(scrollPane); //3 These lines add components to the
        panel.add(completeButton);
        add(panel); //Adds the panel (containing various components) to the JFrame.


        //delete button
        JButton deleteButton = new JButton("Delete task");
        deleteButton.addActionListener(e -> deleteTask());

        // Add prioritize button
        JButton prioritizeButton = new JButton("Prioritize tasks");
        prioritizeButton.addActionListener(e -> prioritizeTasks());
        panel.add(prioritizeButton);

        // Add save button
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> saveTask());
        panel.add(saveButton);

        // Add load button
        JButton loadButton = new JButton("Load");
        loadButton.addActionListener(e -> loadTask());
        panel.add(loadButton);

        //action for the interface
        panel.add(inputJPanel);
        panel.add(scrollPane);
        panel.add(deleteButton);
        add(panel);

    }

    public abstract void addTask();
    public abstract void markAsCompleted();
    public abstract void deleteTask();

    public abstract void prioritizeTasks();
    public abstract void saveTask();
    public abstract void loadTask();
    
}
