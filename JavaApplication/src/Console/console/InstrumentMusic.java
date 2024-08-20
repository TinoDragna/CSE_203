package Console.console;
import java.io.Serializable;

public class InstrumentMusic extends MusicTrack implements Serializable {
    private String instrument;
    private String artist;


    public InstrumentMusic() {
    }

    public InstrumentMusic(String title, String author, int year, String filePath, int type, String instrument,
            String artist) {
        super(title, author, year, filePath, type);
        this.instrument = instrument;
        this.artist = artist;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    


   
}
