package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

import model.MusicPlayer;
import model.Artist;
import view.ServiceSearchView;

public class ServiceSearchController {
    private MusicPlayer model;
    private ServiceSearchView view;
    public ServiceSearchController(MusicPlayer model, ServiceSearchView view) {
        this.model = model;
        this.view = view;
//        this.view.addSearchFieldListener(new SearchAction());
//        this.view.addSongAction(new BookListener());
    }
    private class SearchAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JTextField searchTextField = view.getSearchTextField();
            List<MusicPlayer> searchResults = new ArrayList<>();
            String keyString = searchTextField.getText();
            searchResults = model.searchSong(keyString);
            view.displayResult(searchResults);   
        }
       
    
        
    }

    private class BookListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            MusicPlayer selectedService = view.getSelectedService();
            if (selectedService != null) {
                view.dispose();
//                MainController.setServiceBookingView(view.getPlaylist(), selectedService);

            }

        }
        
    }
}
