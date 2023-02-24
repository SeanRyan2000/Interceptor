public class CdPlayer implements IPushCallBack {
    private Button playButton;
    private Button stopButton;
    private String buttonPushed = "";
    Dispatcher dispatcher = new Dispatcher();
    ConcreteInterceptor interceptor = new ConcreteInterceptor();

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
        dispatcher.dispatchPlay(this);
        System.out.println(buttonPushed);
    }

    // interception point
    public final void stopButtonPushed(Button b){
        dispatcher.dispatchStop(this);
        System.out.println("Stop button pushed \n");
    }
}