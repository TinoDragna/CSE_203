package Console.console;
import java.util.*;

public class LibraryManager {
    private Map<String, Album> albums;
    private Map<String, Artist> artists;

    public LibraryManager() {
        this.albums = new HashMap<>();
        this.artists = new HashMap<>();
    }

    // Thêm album
    public void addAlbum(Album album) {
        albums.put(album.getTitle(), album);
        if (!artists.containsKey(album.getArtist().getName())) {
            artists.put(album.getArtist().getName(), album.getArtist());
        }
    }

    // Thêm nghệ sĩ
    public void addArtist(Artist artist) {
        artists.put(artist.getName(), artist);
    }

    // Hiển thị thông tin về album
    public void displayAlbumInfo(String albumTitle) {
        Album album = albums.get(albumTitle);
        if (album != null) {
            System.out.println(album);
        } else {
            System.out.println("Album not found.");
        }
    }

    // Hiển thị thông tin về nghệ sĩ
    public void displayArtistInfo(String artistName) {
        Artist artist = artists.get(artistName);
        if (artist != null) {
            System.out.println(artist);
        } else {
            System.out.println("Artist not found.");
        }
    }

    public Map<String, Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Map<String, Album> albums) {
        this.albums = albums;
    }

    public Map<String, Artist> getArtists() {
        return artists;
    }

    public void setArtists(Map<String, Artist> artists) {
        this.artists = artists;
    }
}
