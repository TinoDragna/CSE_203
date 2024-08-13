import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UI {
    private JPanel panel1;
    private JTextField textField2;
    private JSlider slider1;
    private JButton button2;
    private JFormattedTextField formattedTextField1;
    private JTable table1;
    private JTextPane textPane1;

    public UI() {
        panel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
