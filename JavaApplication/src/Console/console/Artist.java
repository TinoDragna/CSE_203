package Console.console;
import java.util.*;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Artist [name=" + name + ", albums=" + albums + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

}