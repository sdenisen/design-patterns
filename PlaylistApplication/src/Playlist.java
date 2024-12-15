import java.util.ArrayList;

public class Playlist implements IComponent {
    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        this.playlist.forEach(IComponent::play);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for (IComponent song : this.playlist) {
            song.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    public void remove(IComponent component) {
        this.playlist.remove(component);
    }
    // Your code goes here!
}
