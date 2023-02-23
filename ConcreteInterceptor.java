import java.util.Date;

public class ConcreteInterceptor implements Interceptor{
// this may change data
    public void logTime(CdPlayer cdPlayer) {
        //print the time and date in days and hours
        System.out.println("Time: " + new Date());
        // invoke the dispatcher
    }
}
