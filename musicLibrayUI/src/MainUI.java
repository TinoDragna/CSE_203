import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;


public class MainUI extends JFrame {
    private JPanel MainPanel;
    private JLabel libraryLabel;
    private JLabel UnstoppableLabel;
    private JLabel homeLabel;
    private JTextField libraryTextField;
    private JPanel songsPanel;
    private JPanel homePanel;
    private JPanel artistPanel;
    private JLabel add;

    public MainUI() {
        setContentPane(MainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Music Library");
        setSize(800, 600);
        setLocationRelativeTo(null);

        // Thiết lập layout cho songsPanel
        songsPanel.setLayout(new BoxLayout(songsPanel, BoxLayout.Y_AXIS));
        songsPanel.setBackground(new Color(253, 253, 253));
        songsPanel.setForeground(new Color(9, 80, 56));

        File musicDir = new File("D:\\CSE203\\CSE_203\\musicLibrayUI\\music"); // Đường dẫn đến thư mục nhạc
        if (musicDir.isDirectory()) {
            for (File file : musicDir.listFiles()) {
                if (file.isFile() && file.getName().endsWith(".wav")) {
                    JLabel songLabel = new JLabel(file.getName()); // Tạo JLabel cho mỗi bài hát
                    songLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                    songLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    // Xử lý sự kiện khi nhấn vào JLabel
                    songLabel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            new CurrentSong(musicDir.getPath() + "\\" + file.getName()).setVisible(true);
                            dispose(); // Đóng MainUI khi mở CurrentSong
                        }
                    });

                    songsPanel.add(songLabel); // Thêm JLabel vào songsPanel
                }
            }
        }

        // Ví dụ: xử lý sự kiện khi nhấn vào UnstoppableLabel
        UnstoppableLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                new CurrentSong("D:\\CSE203\\CSE_203\\musicLibrayUI\\music\\Sia - Unstoppable (Official Video - Live from the Nostalgic For The Present Tour).wav").setVisible(true);
//                dispose();
            }
        });

        libraryLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Playlists m = new Playlists();
                m.setVisible(true);
                dispose();;
            }
        });

        pack();
    }

    private void createUIComponents() {
        songsPanel = new JPanel(); // Khởi tạo JPanel chứa danh sách bài hát
    }

    public static void main(String[] args) {
        new MainUI().setVisible(true);
    }
}