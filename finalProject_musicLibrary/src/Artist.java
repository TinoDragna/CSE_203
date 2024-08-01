public class Artist {
    private String name;
    private String imagePath;
    private int follower;
    private Album albums;

    public Artist() {
        this.name = null;
        this.imagePath = null;
        this.follower = 0;
        this.albums = null;
    }

    public Artist(String name, String imagePath, int follower, Album albums) {
        this.name = name;
        this.imagePath = imagePath;
        this.follower = follower;
        this.albums = albums;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getFollower() {
        return follower;
    }

    public void setFollower(int follower) {
        this.follower = follower;
    }

    public Album getAlbums() {
        return albums;
    }

    public void setAlbums(Album albums) {
        this.albums = albums;
    }
    

}
