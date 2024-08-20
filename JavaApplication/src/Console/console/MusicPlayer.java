package Console.console;
public class MusicPlayer {
    private int volume;
    private boolean isRepeating;

    public MusicPlayer() {
        this.volume = 50;  // Âm lượng mặc định là 50%
        this.isRepeating = false;
    }

    // Bật/tắt chức năng lập lại
    public void toggleRepeat() {
        this.isRepeating = !this.isRepeating;
        System.out.println("Repeat mode: " + (this.isRepeating ? "ON" : "OFF"));
    }

    // Phát bài hát

    /**
     *
     * @param song
     */
    public void playSong(MusicTrack song) {        
        System.out.println("Now playing: " + " from file: " + song.getFilePath() +
                           " at volume: " + volume + "%");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isRepeating() {
        return isRepeating;
    }

    public void setRepeating(boolean isRepeating) {
        this.isRepeating = isRepeating;
    }
}
