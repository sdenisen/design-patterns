public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void play() {
        int song_length_ms = (int) (Math.random() * 3000);
        System.out.println("playing the song: " + this.songName + ", artist: " + this.artist +
                "speed: " + this.speed + " length: " + song_length_ms);
        try {
            Thread.sleep(song_length_ms);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.songName;
    }

    // Your code goes here!
}
