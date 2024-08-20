package Console.console;
import java.util.*;

public class Main {

    private static MusicPlayer player = new MusicPlayer();
    private static LibraryManager libraryManager = new LibraryManager();
    private static final List<MusicTrack> preExistingTracks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializePreExistingTracks();

        boolean exit = false;

        while (!exit) {
            displayMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    addAlbum();
                    break;
                case 2:
                    addSongToAlbum(); 
                    break;
                case 3:
                    addSong(); 
                    break;
                case 4:
                    playSong();
                    break;
                case 5:
                    toggleRepeatMode();
                    break;
                case 6:
                    displayAlbumInfo();
                    break;
                case 7:
                    displayArtistInfo();
                    break;
                case 8:
                    displayPreExistingTracks(); 
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void initializePreExistingTracks() {
        preExistingTracks.add(new InstrumentMusic("Track2", "Author2", 2021, "/path/to/track2", 1, "Instrument1", "Artist1"));

        System.out.println("Pre-existing tracks initialized.");
    }

    private static void displayMenu() {
        System.out.println("=== Music Player Admin Console ===");
        System.out.println("1. Add Album");
        System.out.println("2. Add Pre-existing Song to Album");
        System.out.println("3. Add New Song to Pre-existing Tracks");
        System.out.println("4. Play Song");
        System.out.println("5. Toggle Repeat Mode");
        System.out.println("6. Display Album Info");
        System.out.println("7. Display Artist Info");
        System.out.println("8. Show Pre-existing Tracks");
        System.out.println("9. Exit");
        System.out.print("Select an option: ");
    }

    private static void addAlbum() {
        System.out.print("Enter album title: ");
        String albumTitle = scanner.nextLine();
        System.out.print("Enter artist name: ");
        String artistName = scanner.nextLine();
        System.out.print("Enter release date (YYYY-MM-DD): ");
        String releaseDate = scanner.nextLine();
        Artist artist = new Artist(artistName);
        Album album = new Album(albumTitle, artist, releaseDate);
        libraryManager.addAlbum(album);
        System.out.println("Album added successfully.");
    }

    private static void addSongToAlbum() {
        Album album = selectAlbum(); // Choose album
        if (album != null) {
            displayPreExistingTracks(); // Show available tracks
            System.out.print("Enter the number of the track to add: ");
            int trackNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (trackNumber >= 1 && trackNumber <= preExistingTracks.size()) {
                MusicTrack song = preExistingTracks.get(trackNumber - 1);
                album.addSong(song); // Add selected track to the album
                System.out.println("Song added successfully to album.");
            } else {
                System.out.println("Invalid track number.");
            }
        } else {
            System.out.println("Album not found.");
        }
    }

    private static void addSong() {
        System.out.println("Add New Song to Pre-existing Tracks");
        MusicTrack newTrack = createMusicTrack(); // Create a new MusicTrack
        preExistingTracks.add(newTrack); // Add the new track to the list
        System.out.println("New song added to the list of pre-existing tracks.");
    }

    private static void displayPreExistingTracks() {
        System.out.println("Available pre-existing tracks:");
        for (int i = 0; i < preExistingTracks.size(); i++) {
            MusicTrack track = preExistingTracks.get(i);
            System.out.println((i + 1) + ". " + track.getTitle() + " by " + track.getAuthor());
        }
    }

    private static MusicTrack createMusicTrack() {
        System.out.print("Enter song title: ");
        String songTitle = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter release year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter type (0 for lyric, 1 for instrument): ");
        int type = scanner.nextInt();
        scanner.nextLine(); 

        MusicTrack song;
        if (type == 0) {
            System.out.print("Enter singer: ");
            String singer = scanner.nextLine();
            System.out.print("Enter genre: ");
            String genre = scanner.nextLine();
            song = new LyricMusic(songTitle, author, year, filePath, type, singer, genre);
        } else {
            System.out.print("Enter instrument: ");
            String instrument = scanner.nextLine();
            System.out.print("Enter artist: ");
            String artistStr = scanner.nextLine();
            song = new InstrumentMusic(songTitle, author, year, filePath, type, instrument, artistStr);
        }

        return song;
    }

    private static Album selectAlbum() {
        System.out.print("Enter album title (or type 'default' for the default album): ");
        String albumTitle = scanner.nextLine();
        if (albumTitle.equalsIgnoreCase("default")) {
            albumTitle = "Default Album";
        }
        return libraryManager.getAlbums().get(albumTitle);
    }

    private static void playSong() {
        System.out.print("Enter song file path to play: ");
        String playFilePath = scanner.nextLine();
        System.out.print("Enter song title: ");
        String playTitle = scanner.nextLine();
        MusicTrack playSong = null;

        for (Album a : libraryManager.getAlbums().values()) {
            for (MusicTrack track : a.getSongs()) {
                if (track.getFilePath().equals(playFilePath) && track.getTitle().equals(playTitle)) {
                    playSong = track;
                    break;
                }
            }
        }

        if (playSong != null) {
            player.playSong(playSong);
        } else {
            System.out.println("Song not found.");
        }
    }

    private static void toggleRepeatMode() {
        player.toggleRepeat();
    }

    private static void displayAlbumInfo() {
        System.out.print("Enter album title: ");
        String albumTitle = scanner.nextLine();
        libraryManager.displayAlbumInfo(albumTitle);
    }

    private static void displayArtistInfo() {
        System.out.print("Enter artist name: ");
        String artistName = scanner.nextLine();
        libraryManager.displayArtistInfo(artistName);
    }
}
