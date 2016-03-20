import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("VM");
        GUI GUI = new GUI();
        frame.setContentPane(GUI.getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //GUI.redraw();
    }
}
