public class Dispatcher {

    public void dispatchPlay(CdPlayer cdPlayer){
        Interceptor.CdPlay(cdPlayer);

    }

    public void dispatchStop(CdPlayer cdPlayer){
        Interceptor.CdStop(cdPlayer);
    }

    public void register(){

    }

    public void remove(){

    }

    public void iterate_list(){

    }
}
