import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class music extends  JFrame{
    private JPanel imgPane;
    private JLabel abc;
    private JPanel contentPane;

    public static void main(String[] args) {
        new music().setVisible(true);
    }
    public music() {
        setContentPane(contentPane);
        pack();
        abc.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MainUI m = new MainUI();
                m.setVisible(true);
                dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
