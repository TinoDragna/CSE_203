package view;


import java.awt.event.ActionListener;
import java.awt.event.KeyListener;


import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.MusicPlayer;
import model.Song;
import model.Artist;

public class ServiceBookView extends JFrame{
    private MusicPlayer selectedService;

    private JLabel songInfor;
    private JLabel artistInfor;
    private JLabel addLabel;
    private JLabel result;
 

    public ServiceBookView() {


        songInfor = new JLabel();
        artistInfor = new JLabel();
        addLabel = new JLabel("add this service");
        result = new JLabel();
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(new JLabel("Please check the following information!"));
        getContentPane().add(Box.createVerticalStrut(10));
        getContentPane().add(songInfor);
        getContentPane().add(Box.createVerticalStrut(10));
        getContentPane().add(artistInfor);
        getContentPane().add(Box.createVerticalStrut(10));
        getContentPane().add(addLabel);
        getContentPane().add(Box.createVerticalStrut(10));
        getContentPane().add(result);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

    public void addServiceAddLabelListener(ActionListener actionListener){
        addLabel.addKeyListener((KeyListener) actionListener);
    }
    public MusicPlayer getSelectedService() {
        return selectedService;
    }
    

    public void setSelectedService(MusicPlayer selectedService) {
        this.selectedService = selectedService;
        songInfor.setText(selectedService.toString());
        if(!songInfor.isVisible()){
            addLabel.setEnabled(false);
            result.setText("Cannot use this song");
        }
    }


    public void setAddLabelEnable(boolean status){
        addLabel.setEnabled(status);
        getContentPane().revalidate();
        getContentPane().repaint();
        pack();
    }

    
    
}
