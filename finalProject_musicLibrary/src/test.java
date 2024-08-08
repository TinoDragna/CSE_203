import java.util.*;
public class test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Song> songs = new ArrayList<>();
        songs.add(new RockSong("Rock Anthem", "/path/to/rock.mp3", 210, "Rock Artist", "Epic Solo"));
        songs.add(new EDMSong("EDM Hit", "/path/to/edm.mp3", 190, "EDM Artist", "128 BPM"));
        //songs.add(new RelaxSong("Calm Waves", "/path/to/relax.mp3", 300, "Relax Artist", "Peaceful", "Piano"));

        // Tạo playlist
        Playlist playlist = new Playlist("My Playlist");
        for (Song song : songs) {
            playlist.addSong(song);
        }

        // Tạo MusicPlayer
        MusicPlayer player = new MusicPlayer();
        player.setCurrentPlaylist(playlist);

        while (true) {
            showMenu();

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    playSong1(choice, player);
                    break;

                case 2:
                    nextSong2(choice, player);
                    break;

                case 3:
                    setVolume3(choice, player);
                    break;

                case 4:
                    repeat4(choice, player);
                    break;

                case 5:
                    displayPlaylistInfo5(choice, player);
                    break;

                case 6:
                    searchASong6(choice, player);
                    break;

                case 7: // Show song count and list
                    songCountAndList7(choice, player);
                    break;

                case 8:
                    displayAlbumArtistInfo8(choice, player);
                    break;

                case 9: 
                    exit9(choice, player);
                    break;

                case 10: 
                    addSongToPlaylist10(choice, player);
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nMusic Player Menu:");
        System.out.println("1. Play a song");
        System.out.println("2. Next song");
        System.out.println("3. Set volume");
        System.out.println("4. Toggle repeat");
        System.out.println("5. Display playlist info");
        System.out.println("6. Search for a song");
        System.out.println("7. Show song count and list");
        System.out.println("8. Show album and artist info");
        System.out.println("9. Exit");
        System.out.println("10. Add song on top playlist");
        System.out.print("Choose an option: ");
    }

    private static void playSong1(int choice, MusicPlayer player) {
        System.out.print("Enter the title of the song to play: ");
        String titleToPlay = scanner.nextLine();
        Song songToPlay = player.searchSong(titleToPlay);
        if (songToPlay != null) {
            player.playSong(songToPlay);
        } else {
            System.out.println("Song not found.");
        }
    }

    private static void nextSong2(int choice, MusicPlayer player) {
        player.nextSong();
    }

    private static void setVolume3(int choice, MusicPlayer player) {
        System.out.print("Enter the volume (0-100): ");
        int volume = scanner.nextInt();
        player.setVolume(volume);
    }

    private static void repeat4(int choice, MusicPlayer player) {
        player.toggleRepeat();
    }

    private static void displayPlaylistInfo5(int choice, MusicPlayer player) {
        player.displayPlaylistInfo();
    }

    private static void searchASong6(int choice, MusicPlayer player) {
        System.out.print("Enter name of song: ");
        String titleToSearch = scanner.nextLine();
        Song foundSong = player.searchSong(titleToSearch);
        if (foundSong != null) {
            System.out.println(foundSong.getDescription());
        } else {
            System.out.println("song not found.");
        }
    }

    private static void songCountAndList7(int choice, MusicPlayer player) {
        if (player.getCurrentPlaylist() != null) {
            List<Song> playlistSongs = player.getCurrentPlaylist().getSongs();
            System.out.println("Number of songs in the playlist: " + playlistSongs.size());
            System.out.println("List of songs:");
            for (Song song : playlistSongs) {
                System.out.println(song.getDescription());
            }
        } else {
            System.out.println("No playlist is currently set.");
        }
    }

    private static void displayAlbumArtistInfo8(int choice, MusicPlayer player) {
        System.out.println("1. Display album info");
        System.out.println("2. Display artist info");
        System.out.print("Choose an option: ");
        int subChoice = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline

        if (subChoice == 1) {
            System.out.print("Enter the album title: ");
            String albumTitle = scanner.nextLine();
            player.displayAlbumInfo(albumTitle);
        } else if (subChoice == 2) {
            System.out.print("Enter the artist name: ");
            String artistName = scanner.nextLine();
            player.displayArtistInfo(artistName);
        } else {
            System.out.println("Invalid option.");
        }
    }

    private static void exit9(int choice, MusicPlayer player) {
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }

    private static void addSongToPlaylist10(int choice, MusicPlayer player) {
        System.out.print("Enter name of song: ");
        String title = scanner.nextLine();
        System.out.print("Enter path of song: ");
        String path = scanner.nextLine();
        System.out.print("Enter duration of song (in seconds): ");
        int duration = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline
        System.out.print("Enter artist of song: ");
        String artist = scanner.nextLine();

        Song song = new Song(title, path, duration, artist) {
            @Override
            public String getDescription() {
                return "Title: " + getTitle() + ", Artist: " + getArtist() + ", Duration: " + getDuration() + " seconds";
            }
        };
        player.getCurrentPlaylist().addSong(song);
        System.out.println("Song added to playlist.");

    }

}
