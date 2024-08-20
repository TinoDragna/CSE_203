
package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class LibraryManager {
    private ArrayList<MusicTrack> songs;
    private Map<String, MusicTrack> songMap;

    public LibraryManager() {
        songs = new ArrayList<>();
        songMap = new HashMap<>();
    }

    public void setSongs(ArrayList<MusicTrack> songs) {
        this.songs = songs;
        updateSongMap();
    }

    public ArrayList<MusicTrack> getSongs() {
        return songs;
    }

    private void updateSongMap() {
        songMap.clear();
        for (MusicTrack track : songs) {
            songMap.put(track.getTitle().toLowerCase(), track);
        }
    }

    private void loadFile() {
        String fileName = "List.data";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            this.songs = (ArrayList<MusicTrack>) ois.readObject();
            updateSongMap();
        } catch (ClassNotFoundException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void saveToFile() {
        String fileName = "List.data";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(songs);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private Optional<MusicTrack> findSong(String title) {
        return Optional.ofNullable(songMap.get(title.toLowerCase()));
    }

    public void removeTrack(String title) {
        Optional<MusicTrack> trackToRemove = findSong(title);
        if (trackToRemove.isPresent()) {
            songs.remove(trackToRemove.get());
            songMap.remove(title.toLowerCase());
        } else {
            JOptionPane.showMessageDialog(null, "Track not found.");
        }
    }
    public void addSong(MusicTrack newTrack) {
        if (newTrack == null || newTrack.getTitle() == null || newTrack.getTitle().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid track data.");
            return;
        }

        Optional<MusicTrack> existingTrack = findSong(newTrack.getTitle());

        if (existingTrack.isPresent()) {
            JOptionPane.showMessageDialog(null, "Track already exists.");
        } else {
            songs.add(newTrack);
            songMap.put(newTrack.getTitle().toLowerCase(), newTrack);
            JOptionPane.showMessageDialog(null, "Track added successfully.");
        }
    }
}