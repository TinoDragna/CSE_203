import java.util.*;

public class Album {
    private String title;
    private Artist artist;
    private String releaseDate;
    private List<Song> songs;

    public Album() {
    }

    public Album(String title, Artist artist, String releaseDate) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.songs = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Album [title=" + title + ", artist=" + artist.getName() + ", releaseDate=" + releaseDate + ", songs=" + songs + "]";
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}