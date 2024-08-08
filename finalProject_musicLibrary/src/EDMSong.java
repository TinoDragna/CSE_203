public class EDMSong extends Song {
    private String bpm; // Thuộc tính riêng cho bài hát EDM

    public EDMSong(String title, String filePath, int duration, String artist, String bpm) {
        super(title, filePath, duration, artist);
        this.bpm = bpm;
    }

    @Override
    public String getDescription() {
        return "EDM Song [Title: " + getTitle() + ", Artist: " + getArtist() +
               ", File: " + getFilePath() + ", Duration: " + getDuration() +
               " seconds, BPM: " + bpm + "]";
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }

    
}