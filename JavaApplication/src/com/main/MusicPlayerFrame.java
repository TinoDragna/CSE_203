/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.main;

import Model.MusicPlayer;
import Model.MusicTrack;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author asus
 */
public class MusicPlayerFrame extends javax.swing.JFrame {

    private Clip clip;
    private boolean isDragging = false;
    private boolean isPlaying = false;
    private boolean isLooping = false;
    private long clipTimePosition = 0;

    static MusicPlayer player = MusicPlayer.getInstance();
    static String filePath;

    public MusicPlayerFrame(MusicTrack song) {
        initComponents();

        try {
            File audioFile = new File(song.getFilePath());
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioStream);

        
            slider1.setMaximum((int) (clip.getMicrosecondLength() / 1000));

            Timer timer = new Timer(1000, e -> {
                if (!isDragging && isPlaying && playButton.getText() == "❚❚") {
                    if (clip.getMicrosecondPosition() >= clip.getMicrosecondLength()) {
                        clip.setMicrosecondPosition(0); 
                        slider1.setValue(0); 
                        clip.start(); 
                    } else {
                        slider1.setValue((int) (clip.getMicrosecondPosition() / 1000));
                    }
                }
            });
            timer.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

      
        slider1.addChangeListener(e -> {
            if (clip != null && !isDragging) {
                clip.setMicrosecondPosition(slider1.getValue() * 1000);
            }
        });


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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slider1 = new javax.swing.JSlider();
        playButton = new javax.swing.JButton();
        loopButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1030, 670));

        slider1.setBackground(new java.awt.Color(0, 0, 0));
        slider1.setForeground(new java.awt.Color(0, 153, 153));
        slider1.setMaximum(10000);
        slider1.setMinimum(100);
        slider1.setMaximumSize(new java.awt.Dimension(3000, 100));
        slider1.setMinimumSize(new java.awt.Dimension(700, 15));
        slider1.setPreferredSize(new java.awt.Dimension(750, 50));
        slider1.setRequestFocusEnabled(false);
        slider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider1StateChanged(evt);
            }
        });
        slider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                slider1MouseDragged(evt);
            }
        });

        playButton.setBackground(new java.awt.Color(63, 63, 63));
        playButton.setForeground(new java.awt.Color(255, 255, 255));
        playButton.setText("▶");
        playButton.setBorder(null);
        playButton.setMaximumSize(new java.awt.Dimension(78, 24));
        playButton.setMinimumSize(new java.awt.Dimension(50, 15));
        playButton.setPreferredSize(new java.awt.Dimension(50, 10));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        loopButton.setBackground(new java.awt.Color(63, 63, 63));
        loopButton.setForeground(new java.awt.Color(255, 255, 255));
        loopButton.setText("↺");
        loopButton.setBorder(null);
        loopButton.setMaximumSize(new java.awt.Dimension(200, 200));
        loopButton.setMinimumSize(new java.awt.Dimension(50, 15));
        loopButton.setPreferredSize(new java.awt.Dimension(50, 20));
        loopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loopButtonActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("• ılıılıılıılıılıılı.");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(72, 24));
        jLabel2.setMinimumSize(new java.awt.Dimension(20, 15));
        jLabel2.setPreferredSize(new java.awt.Dimension(20, 15));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icon/m_img1.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1010, 561));
        jLabel3.setMinimumSize(new java.awt.Dimension(1010, 561));
        jLabel3.setPreferredSize(new java.awt.Dimension(1010, 561));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1Click(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loopButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(slider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slider1MouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_slider1MouseDragged

    private void slider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider1StateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_slider1StateChanged

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        togglePlayPause();
    }//GEN-LAST:event_playButtonActionPerformed

    private void loopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loopButtonActionPerformed
        if (clip != null) {
            if (!isLooping && isPlaying) {
                loopButton.setText("stop ︎↻"); // Thay đổi văn bản của nút để hiển thị trạng thái Loop
                clip.loop(Clip.LOOP_CONTINUOUSLY); // Thiết lập chế độ lặp liên tục
            } else if (!isPlaying) {
                clip.stop();
            } else {
                clip.loop(0); // Dừng chế độ lặp
                loopButton.setText("↺"); // Thay đổi văn bản của nút để hiển thị trạng thái không lặp
            }
            isLooping = !isLooping;

        }
    }//GEN-LAST:event_loopButtonActionPerformed

    private void jLabel1Click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1Click
        // Đây là phương thức cho sự kiện nhấn nút
        togglePlayPause();
    }//GEN-LAST:event_jLabel1Click

    
    private void togglePlayPause() {
    if (clip != null) {
        if (isPlaying) {
            clipTimePosition = clip.getMicrosecondPosition(); // Save the current position
            clip.stop(); // Stop the playback
            isPlaying = false; // Update the playing state
            playButton.setText("▶︎"); // Update button text to Play
        } else {
            clip.setMicrosecondPosition(clipTimePosition); // Restore the position
            clip.start(); // Start the playback
            isPlaying = true; // Update the playing state
            playButton.setText("❚❚"); // Update button text to Pause
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loopButton;
    private javax.swing.JButton playButton;
    private javax.swing.JSlider slider1;
    // End of variables declaration//GEN-END:variables
}
