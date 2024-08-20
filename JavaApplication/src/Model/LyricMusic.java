package Model;

import java.io.Serializable;


public class LyricMusic extends MusicTrack implements Serializable{
    private String singer;
    private String gener;

    public LyricMusic(String singer, String gener, String title, String author, String genre, int year, String filePath) {
        super(title, author, genre, year, filePath);
        this.singer = singer;
        this.gener = gener;
         setType(0);
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    @Override
    public String toString() {
        return "LyricMusic{" + "singer=" + singer + ", gener=" + gener + '}';
    }

    

   
    
    
    

}
  