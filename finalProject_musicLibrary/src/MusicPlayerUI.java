import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicPlayerUI extends JFrame {

    private JLabel songLabel;
    private JSlider volumeSlider;
    private JButton playButton, pauseButton, stopButton, nextButton;

    public MusicPlayerUI() {
        // Initialize UI Components
        initComponents();

        // Set up the JFrame
        setTitle("Java Music Player");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window
    }

    private void initComponents() {
        // Song Label
        songLabel = new JLabel("No song playing");
        songLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Playback Buttons
        playButton = new JButton("Play");
        pauseButton = new JButton("Pause");
        stopButton = new JButton("Stop");
        nextButton = new JButton("Next");

        // Volume Slider
        volumeSlider = new JSlider(0, 100, 50);
        volumeSlider.setMajorTickSpacing(10);
        volumeSlider.setPaintTicks(true);
        volumeSlider.setPaintLabels(true);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));
        buttonPanel.add(playButton);
        buttonPanel.add(pauseButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(nextButton);

        // Volume Control Panel
        JPanel volumePanel = new JPanel();
        volumePanel.setLayout(new BorderLayout());
        volumePanel.add(new JLabel("Volume"), BorderLayout.WEST);
        volumePanel.add(volumeSlider, BorderLayout.CENTER);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(songLabel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(volumePanel, BorderLayout.SOUTH);

        // Add Main Panel to Frame
        add(mainPanel);

        // Button Actions
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                songLabel.setText("Playing: Example Song");  // Update this with actual logic
            }
        });

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                songLabel.setText("Paused");
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                songLabel.setText("Stopped");
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                songLabel.setText("Playing next song...");
            }
        });

        volumeSlider.addChangeListener(e -> {
            int volume = volumeSlider.getValue();
            System.out.println("Volume: " + volume);
            // Adjust volume logic here
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MusicPlayerUI musicPlayerUI = new MusicPlayerUI();
            musicPlayerUI.setVisible(true);
        });
    }
}
