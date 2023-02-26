import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dispatcher {
    Date time = new Date();
    List commandCalled = new ArrayList();
    List timeCalled = new ArrayList();

    public void dispatchPlay(CdPlayer cdPlayer){
        register("dispatchPlay", time);
        ConcreteInterceptor.CdPlay(cdPlayer);
    }

    public void dispatchStop(CdPlayer cdPlayer){
        register("dispatchStop", time);
        iterate_list();
        ConcreteInterceptor.CdStop(cdPlayer);
    }

    public void register(String command, Date time){
        commandCalled.add(command);
        timeCalled.add(time);
    }

    public void remove(int index){
        commandCalled.remove(index);
        timeCalled.remove(index);
    }

    public void iterate_list(){
        for(int i = 0; i < commandCalled.size(); i++){
            System.out.println("Command called: " + commandCalled.get(i) + " at time: " + timeCalled.get(i));
        }
    }

    public void attach(ConcreteInterceptor interceptor) {
    }
}
