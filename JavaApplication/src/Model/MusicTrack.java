package Model;

import java.io.Serializable;

public class MusicTrack implements Serializable {
    private String title;
    private String author;
    private String genre;
    private int year; 
    private String filePath;
    private int type=-1;

    public MusicTrack() {
    }

    public MusicTrack(String title, String author, String genre, int year, String filePath) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.filePath = filePath;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "MusicTrack{" + "title=" + title + ", author=" + author + ", genre=" + genre + ", year=" + year + ", filePath=" + filePath + '}';
    }
    
}
    

   