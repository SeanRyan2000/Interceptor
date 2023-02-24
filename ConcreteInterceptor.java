import java.util.Date;

public class ConcreteInterceptor implements Interceptor{

    // this can only call the context object 
    public static void CdPlay(CdPlayer cdPlayer){
        cdPlayer.setButtonPushed("Play button pushed from the interceptor \n");
    }

    public static void CdStop(CdPlayer cdPlayer){
        cdPlayer.setButtonPushed("Stop button pushed");
    }



}
