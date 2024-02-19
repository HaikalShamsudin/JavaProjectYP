package Day10.Q3;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> {
            ToDoList app = new ToDoList();
            app.setVisible(true);
        });
    }
    
}
