public class CdPlayer implements IPushCallBack {
    private Button playButton;
    private Button stopButton;
    private String buttonPushed = "";
    Dispatcher dispatcher = new Dispatcher();

    public String getButtonPushed() {
        return buttonPushed;
    }

    public void setButtonPushed(String buttonPushed) {
        this.buttonPushed = buttonPushed;
    }

    public final void notifyButtonPushed(Button b){
        if(b == playButton) this.playButtonPushed(b);
        if(b == stopButton) this.stopButtonPushed(b);
    }


    public final void setPlayButton(Button b){
        playButton = b;
    }
    public final void setStopButton(Button b){
        stopButton = b;
    }

    // interception point
    public final void playButtonPushed(Button b){
        dispatcher.dispatchPlayButton(this);
        System.out.println(buttonPushed);
    }

    //new method to call the dispatcher 

    // interception point
    public final void stopButtonPushed(Button b){
        dispatcher.dispatchStopButton(this);
        System.out.println("Stop button pushed \n");
    }
}