import java.util.Date;

public class ConcreteInterceptor implements Interceptor{
    

    // this can only call the context object 
    public static void CdPlay(CdPlayer cdPlayer){
        ContextObject.playSong();

        // cdPlayer.setButtonPushed("Play button pushed from the interceptor \n");
    }

    public static void CdStop(CdPlayer cdPlayer){
		ContextObject.stopSong();

        // cdPlayer.setButtonPushed("Stop button pushed");
    }



}
