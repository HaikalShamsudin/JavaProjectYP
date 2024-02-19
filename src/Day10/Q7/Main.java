package Day10.Q7;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ChatApplication().setVisible(true);
            }
        });
    }
}