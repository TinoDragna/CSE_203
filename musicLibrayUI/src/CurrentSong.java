import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class CurrentSong extends JFrame {

    private Clip clip;
    private boolean isDragging = false;
    private JButton playButton;
    private JButton stopButton;
    private JSlider slider1;
    private JPanel imgPane;
    private JPanel CurrentSongPane;
    private JButton a︎Button;
    private JLabel imgLabel;
    private JLabel homeLabel;
    private JTextField searchField;
    private JTextPane inforTextPane;
    private JLabel buttonLabel;
    private JLabel libraryLabel;
    private JLabel addSongLabel;
    private JList list1;
    private JButton a︎Button2;

    public CurrentSong() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//application will be closed when you close frame
        frame.setSize(800, 600);
        frame.setLocation(200, 200);


//        JFileChooser fc = new JFileChooser();
//        if(fc.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION){
//            BufferedImage img = null;//it must be an image file, otherwise you'll get an exception
//            try {
//                img = ImageIO.read(fc.getSelectedFile());
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            JLabel label = new JLabel();
//            label.setIcon(new ImageIcon(img));
//            frame.getContentPane().add(label);
//        }
//
//        frame.setVisible(true);//showing up the frame

        new CurrentSong().setVisible(true);
    }


    public CurrentSong(String songPath) {
        setTitle("Now Playing - " + new File(songPath).getName());
        setContentPane(CurrentSongPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

        // Tải tệp âm thanh và khởi tạo clip
        try {
            File audioFile = new File(songPath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);

            // Đặt giá trị tối đa của slider
            slider1.setMaximum((int) (clip.getMicrosecondLength() / 1000));

            // Cập nhật vị trí slider mỗi giây
            Timer timer = new Timer(1000, e -> {
                if (!isDragging) {
                    slider1.setValue((int) (clip.getMicrosecondPosition() / 1000));
                }
            });
            timer.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        // Hành động cho nút Play
        playButton.addActionListener(e -> {
            if (clip != null && !clip.isRunning()) {
                clip.setMicrosecondPosition(slider1.getValue() * 1000);
                clip.start();
            }
        });

        // Hành động cho nút Stop
        stopButton.addActionListener(e -> {
            if (clip != null && clip.isRunning()) {
                clip.stop();
            }
        });

        // Hành động thay đổi giá trị slider
        slider1.addChangeListener(e -> {
            if (clip != null && !isDragging) {
                clip.setMicrosecondPosition(slider1.getValue() * 1000);
            }
        });

        // Xử lý sự kiện kéo slider
        slider1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                isDragging = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isDragging = false;
                if (clip != null) {
                    clip.setMicrosecondPosition(slider1.getValue() * 1000);
                }
            }
        });

        // Thêm chức năng nhảy đến đoạn khác trong bài nhạc
        slider1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (clip != null) {
                    int mouseX = e.getX();
                    int sliderValue = (int) ((mouseX / (double) slider1.getWidth()) * slider1.getMaximum());
                    slider1.setValue(sliderValue);
                    clip.setMicrosecondPosition(slider1.getValue() * 1000);
                }
            }
        });

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

        libraryLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Playlists m = new Playlists();
                m.setVisible(true);
//                dispose();
            }
        });


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
