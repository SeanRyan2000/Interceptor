public class Dispatcher {

	public void dispatch(CdPlayer cdPlayer) {
        // TODO Auto-generated method stub
	}

    public void dispatchStopButton(CdPlayer cdPlayer) {
        cdPlayer.setButtonPushed("stop button pushed");
    }

    public void dispatchPlayButton(CdPlayer cdPlayer) {
        cdPlayer.setButtonPushed("play button pushed");
    }
    // calls back to the concrete interceptor
    // attach detatch notify call back

    //add remove dispatcher context object 
}
