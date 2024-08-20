
package Model;
import java.util.ArrayList;
import java.util.List;
public class Album {
    private String title;
    private Artist artist;
    private String releaseDate;
    private List<MusicTrack> songs;

    public Album(String title, Artist artist, String releaseDate) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.songs = new ArrayList<>();
    }

    public void addSong(MusicTrack song) {
        songs.add(song);
    }

    public List<MusicTrack> getSongs() {
        return songs;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Album{" + "title=" + title + ", artist=" + artist + ", releaseDate=" + releaseDate + ", songs=" + songs + '}';
    }

   
}