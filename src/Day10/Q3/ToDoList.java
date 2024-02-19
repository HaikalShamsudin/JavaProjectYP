package Day10.Q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

import Day9.Q3.TodoListManager;

@SuppressWarnings("unchecked")
public class ToDoList extends TodoListManager { //inner class
    public ToDoList() {
        super();
    }

    
    public void addTask() { 
        String task = taskTextField.getText().trim();
        if (!task.isEmpty()) {
            todoListModel.addElement(task);
            taskTextField.setText("");
        }
    }


    public void markAsCompleted() { //this is the constructor for the complete button method
        int selectTask = todoList.getSelectedIndex(); //This line retrieves the index of the selected item in the JList.
        if (selectTask != -1) { //Checks if an item is selected 
            todoListModel.setElementAt("[Completed]" + todoListModel.getElementAt(selectTask), selectTask);
        }
    }

    public void deleteTask() {
       int selectTask = todoList.getSelectedIndex();
       if (selectTask != -1) {
        todoListModel.remove(selectTask);
       }
    }
    public void prioritizeTasks() { //This list will store the tasks from the 
        List<String> tasks = new ArrayList<>();
        for (int i = 0; i < todoListModel.size(); i++) {
            tasks.add(todoListModel.getElementAt(i).toString()); //This retrieves the element at index i from the DefaultListModel.
                                                                //Since getElementAt() returns an Object, we use .toString() to convert it to a String.
        }
        Collections.sort(tasks); //to sort the list alphabetically. This ensures that tasks are in alphabetical order.
        todoListModel.clear(); //This removes all elements from the list model.
        for (String task : tasks) { 
            todoListModel.addElement(task); 
            // Finally, we iterate through the sorted tasks list using an enhanced for loop.
            // At each iteration, we retrieve a task from the tasks list and add it back to the DefaultListModel using todoListModel.addElement(task).
            // This populates the DefaultListModel with the sorted tasks, ensuring they appear in alphabetical order in the GUI.
        }
    }
     public void saveTask() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("todoList.txt"))) {
            for (int i = 0; i < todoListModel.size(); i++) {
                writer.println(todoListModel.getElementAt(i));
            }
            JOptionPane.showMessageDialog(this, "Todo list saved successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving todo list.", "Error", JOptionPane.ERROR_MESSAGE);
    } }

     public void loadTask() {
        try (BufferedReader reader = new BufferedReader(new FileReader("todoList.txt"))) {
            String line;
            todoListModel.clear();
            while ((line = reader.readLine()) != null) {
                todoListModel.addElement(line);
            }
            JOptionPane.showMessageDialog(this, "Todo list loaded successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading todo list.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
