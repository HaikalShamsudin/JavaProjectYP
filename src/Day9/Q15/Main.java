package Day9.Q15;

import javax.swing.SwingUtilities;

public class Main {
     public static void main(String[] args) {
        // Using this method to generate GUI
        SwingUtilities.invokeLater(() -> {
            RecipeBookApp app = new RecipeBookApp();
            app.setVisible(true);
        });
    }
    
}
