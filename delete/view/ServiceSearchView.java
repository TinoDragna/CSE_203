package view;
import java.util.List;

import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.JScrollPane;

import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import model.MusicPlayer;

public class ServiceSearchView extends JFrame{
    final int MAX_ROW_DISPLAY = 10;
    private JLabel title;
    private JTextField searchTextField;
    private JButton searchButton;
    private JLabel resultNoti;
    private JList<MusicPlayer> resultList;
    private DefaultListModel<MusicPlayer> listModel;
    private JSplitPane SongPane;
//    private JButton bookServiceButton;


    public ServiceSearchView(){
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        title = new JLabel();
        searchTextField = new JTextField();
        searchButton = new JButton("Search for a service");
        resultNoti = new JLabel();
        JSplitPane searchPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, searchTextField, searchButton);
        searchPane.setDividerLocation(300); // Set the initial position of the divider
        searchPane.setResizeWeight(0.7); // Allocate 70% of space to the left panel

        listModel = new DefaultListModel<>();
        resultList = new JList<>(listModel);
        resultList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        getContentPane().add(title);
        getContentPane().add(Box.createVerticalStrut(10));
        add(searchPane);
        getContentPane().add(Box.createVerticalStrut(10));
        add(resultNoti);
        getContentPane().add(Box.createVerticalStrut(10));
        JScrollPane listScrollPane = new JScrollPane(resultList);
        add(listScrollPane);
        getContentPane().add(Box.createVerticalStrut(10));
        searchButton = new JButton("Book");
        SongPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JLabel("Select one service and press the Book button"), searchButton);
        SongPane.setDividerLocation(300); // Set the initial position of the divider
        SongPane.setResizeWeight(0.7); // Allocate 70% of space to the left panel
        
        setSize(500, 280);
        // pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

    public JTextField getSearchTextField() {
        return searchTextField;
    }

    public void addSearchButtonListener(ActionListener actionListener) {
        searchButton.addActionListener(actionListener);
    }

    public void displayResult(List<MusicPlayer> searchResults){
        if (searchResults.size() !=0) {
            resultNoti.setText("Great! We found some results");
            for (MusicPlayer service : searchResults) {
                listModel.addElement(service);
                
            }
            getContentPane().add(SongPane);
            getContentPane().revalidate();
            getContentPane().repaint();
            pack();
            
        }
        else
            resultNoti.setText("Unfortunately, no result found!");
            
    }

    public MusicPlayer getSelectedService(){
        return resultList.getSelectedValue();
    }

    public void addBookServiceAction(ActionListener actionListener){
        searchButton.addActionListener(actionListener);

    }


}
