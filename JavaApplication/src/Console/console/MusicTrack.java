package Console.console;
public abstract class MusicTrack {
    private String title;
    private String author;
    private int year  ;
    private String filePath;
    private int type=-1;

    public MusicTrack() {
    }


    public MusicTrack(String title, String author, int year, String filePath, int type) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.filePath = filePath;
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


    public int getType() {
        return type;
    }


    public void setType(int type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "MusicTrack [title=" + title + ", author=" + author + ", year=" + year + ", filePath=" + filePath
                + ", type=" + type + "]";
    }

    


   

    





    

}
