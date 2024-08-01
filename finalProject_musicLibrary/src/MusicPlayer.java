
import java.util.*;

public class MusicPlayer extends Song{
    private ArrayList <Song> playList;
    private int currentSong;
    private double volume;

    public MusicPlayer() {
        this.playList = null;
        this.currentSong = -1;
        this.volume = 10;
    }

    public MusicPlayer(ArrayList<Song> playList, int currentSong, double volume) {
        this.playList = playList;
        this.currentSong = currentSong;
        this.volume = volume;
    }

    public void addTopPlaylist(Song song){
        if (playList.contains(song)){
            playList.remove(song);
        } 
        playList.add(0, song);
    }

    public void removeFromPlaylist(Song song){
        playList.remove(song);
    }

    public boolean isRepeat (){
        return true;
    }

    public void play (){

    }

    public void pause (){

    }

    public void next (){

    }

    public void previous (){
        
    }






    public ArrayList<Song> getPlayList() {
        return playList;
    }

    public void setPlayList(ArrayList<Song> playList) {
        this.playList = playList;
    }

    public int getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(int currentSong) {
        this.currentSong = currentSong;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    
}
