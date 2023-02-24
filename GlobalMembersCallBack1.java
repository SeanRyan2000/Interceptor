public class GlobalMembersCallBack1 {
    public static void main(String[] args) {

        
        CdPlayer cdPlayer = new CdPlayer();
        Button playButton = new Button(cdPlayer);
        Button stopButton = new Button(cdPlayer);

        // create dispatcher
        // create intercewptor 
        // attatch interceptor to dispatcher

        Dispatcher dispatcher = new Dispatcher();
        ConcreteInterceptor interceptor = new ConcreteInterceptor();
        

        cdPlayer.setPlayButton(playButton);
        cdPlayer.setStopButton(stopButton);
        
        playButton.push();
        stopButton.push();
    }
} 