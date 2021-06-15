package comportamiento.memento;

import comportamiento.memento.gui.EmployeeGUI;

public class MementoMain {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeGUI().setVisible(true);
            }
        });
    }
}
