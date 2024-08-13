import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class Playlists extends JFrame{
    private JPanel MainPanel;
    private JPanel songsPanel;
    private JPanel homePanel;
    private JLabel homeLabel;
    private JLabel libraryLabel;
    private JTextField libraryTextField;
    private JLabel add;
    private JPanel playlistPanel;
    private JLabel UnstoppableLabel;
    private JPanel playlists;

    public static void main(String[] args) {
        new Playlists().setVisible(true);
    }

    public Playlists(){
        setContentPane(playlists);
        pack();

        homeLabel.addMouseListener(new MouseListener() {
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

        File musicDir = new File("D:\\CSE203\\CSE_203\\musicLibrayUI\\music"); // Đường dẫn đến thư mục nhạc
        if (musicDir.isDirectory()) {
            for (File file : musicDir.listFiles()) {
                if (file.isFile() && file.getName().endsWith(".wav")) {
                    JLabel songLabel = new JLabel(file.getName()); // Tạo JLabel cho mỗi bài hát
                    songLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                    songLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    songsPanel.add(songLabel); // Thêm JLabel vào songsPanel
                }
            }
        }





    }
}
