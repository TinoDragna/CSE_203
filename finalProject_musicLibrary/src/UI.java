import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UI {
    private JTextField textField1;
    private JPanel panel1;
    private JTextField textField2;
    private JButton button1;

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
