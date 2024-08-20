package Console.console;
import java.io.Serializable;

public class LyricMusic extends MusicTrack implements Serializable {
    private String singer;
    private String genre;

    
    public LyricMusic(String singer, String genre) {
        this.singer = singer;
        this.genre = genre;
    }

    public LyricMusic(String title, String author, int year, String filePath, int type, String singer, String genre) {
        super(title, author, year, filePath, type);
        this.singer = singer;
        this.genre = genre;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "LyricMusic [singer=" + singer + ", genre=" + genre + "]";
    }
    
}

    

    
