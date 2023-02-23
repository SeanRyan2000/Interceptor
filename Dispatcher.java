public class Dispatcher {
    public void dispatchStopButton(CdPlayer cdPlayer) {
        cdPlayer.setButtonPushed("stop button pushed");
        Interceptor.update(this);
    }

    public void dispatchPlayButton(CdPlayer cdPlayer) {
        cdPlayer.setButtonPushed("play button pushed");
    }
    // calls back to the concrete interceptor
    // attach detatch notify call back
    // add remove dispatcher context object 
}
