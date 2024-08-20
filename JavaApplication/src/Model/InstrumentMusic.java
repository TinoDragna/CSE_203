/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
import Model.MusicTrack;
import java.io.Serializable;

/**
 *
 * @author PC
 */

    public class InstrumentMusic extends MusicTrack implements Serializable {
        private String instrument;
        private String artist;

    
      
    public InstrumentMusic(String instrument, String artist, String title, String author, String genre, int year, String filePath) {
        super(title, author, genre, year, filePath);
        this.instrument = instrument;
        this.artist = artist;
        setType(1);
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

    @Override
    public String toString() {
        return "InstrumentMusic{" + "instrument=" + instrument + ", artist=" + artist + '}';
    }

    
        
    }