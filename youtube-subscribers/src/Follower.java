public class Follower implements Observer{

    private String followerName;
    private String newVideo;
    public Follower(String followerName){
        this.followerName = followerName;

    }

    @Override
    public void update(String newVideo) {
        this.newVideo = newVideo;
        this.play();
    }

    public void play(){
        System.out.println("Follower {" + this.followerName + "} gets new video from channel: " + this.newVideo);
    }
}
