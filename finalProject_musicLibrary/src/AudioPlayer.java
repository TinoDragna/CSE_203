import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class AudioPlayer extends JFrame {
    private Clip clip;
    private JSlider slider;
    private boolean isDragging = false;

    public AudioPlayer() {
        setTitle("Audio Player");
        setSize(400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo giao diện
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        // Thêm nút phát và dừng
        JButton playButton = new JButton("Play");
        JButton stopButton = new JButton("Stop");
        panel.add(playButton);
        panel.add(stopButton);

        // Thêm JSlider
        slider = new JSlider();
        slider.setValue(0);
        slider.setMaximum(1000);
        panel.add(slider);

        // Tải âm thanh
        try {
            File audioFile = new File("path/to/your/audiofile.wav"); // Thay đổi đường dẫn tới tệp âm thanh của bạn
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);

            // Đặt giá trị tối đa của slider
            slider.setMaximum((int) (clip.getMicrosecondLength() / 1000));
            
            // Cập nhật slider mỗi giây
            Timer timer = new Timer(1000, e -> {
                if (!isDragging) {
                    slider.setValue((int) (clip.getMicrosecondPosition() / 1000));
                }
            });
            timer.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        // Thêm hành động cho các nút
        playButton.addActionListener(e -> {
            if (clip != null && !clip.isRunning()) {
                clip.setMicrosecondPosition(slider.getValue() * 1000);
                clip.start();
            }
        });

        stopButton.addActionListener(e -> {
            if (clip != null && clip.isRunning()) {
                clip.stop();
            }
        });

        // Xử lý sự kiện thay đổi giá trị của slider
        slider.addChangeListener(e -> {
            if (clip != null && !isDragging) {
                clip.setMicrosecondPosition(slider.getValue() * 1000);
            }
        });

        // Xử lý sự kiện kéo slider
        slider.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                isDragging = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isDragging = false;
                if (clip != null) {
                    clip.setMicrosecondPosition(slider.getValue() * 1000);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AudioPlayer player = new AudioPlayer();
            player.setVisible(true);
        });
    }
}