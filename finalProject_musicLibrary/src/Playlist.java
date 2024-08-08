import java.util.ArrayList;
import java.util.List;

public class Playlist {
    
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        if (songs.contains(song)){
            songs.remove(song);
        } 
        songs.add(0, song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Playlist [name=" + name + ", songs=" + songs + "]";
    }
}