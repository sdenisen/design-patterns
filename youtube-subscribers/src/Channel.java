import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();;
    private String channelName;
    private String status;


    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(obs -> {
            obs.update(this.status);
        });
    }
}
