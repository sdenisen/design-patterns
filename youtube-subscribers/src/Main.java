//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Channel channel = new Channel("my-youtube-channel");

        Follower follower1 = new Follower("my-fan-1");
        Follower follower2 = new Follower("my-fan-2");
        Follower follower3 = new Follower("my-fan-3");

        channel.registerObserver(follower1);
        channel.registerObserver(follower2);
        channel.registerObserver(follower3);

        channel.setStatus("new-video-available");
        channel.notifyObserver();

        channel.removeObserver(follower2);

        channel.setStatus("new-video-available-2");
        channel.notifyObserver();
        return;




//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}