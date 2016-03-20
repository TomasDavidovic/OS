import javax.swing.*;

/**
 * Created by Robertas on 3/20/2016.
 */
public class GUI {

    private JPanel panel;
    private JScrollPane memoryPanel;
    private JTextField IC;
    private JTextField R;
    private JTextField C;
    private JTextField CS;
    private JTextField DS;
    private JTextField PTR;
    private JButton stepButton;
    private JButton Step;
    private JButton executeButton;
    private JButton button4;
    private JButton button5;
    private int memoryMode;
    public final int MEMORY_MODE_VIRTUAL = 0;
    public final int MEMORY_MODE_REAL = 1;
    public final int MEMORY_PAGE_SIZE = 256;
    private int memoryPage;
    private JTextField[] memoryField;



    private void createUIComponents() {
        JPanel insidePanel = new JPanel(new SpringLayout());
        memoryPanel = new JScrollPane(insidePanel);
        int cols = 7;
        int i = 0;
//        memoryField = new JTextField[(VirtualMachine.MEMORY_SIZE+1)*cols]; //Pakeisti
//        memoryField[i] = new JTextField("Real Address");
//        insidePanel.add(memoryField[i]);
//        memoryField[i++].setEditable(false);
//        memoryField = new JTextField[(VirtualMachine.MEMORY_SIZE+1)*cols]; //Pakeisti
//        memoryField[i] = new JTextField("Virtual Address");
//        insidePanel.add(memoryField[i]);
//        memoryField[i++].setEditable(false);
    }

    public JPanel getPanel() {
        return panel;
    }
}
