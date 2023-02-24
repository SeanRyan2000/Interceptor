public interface Interceptor {
	public static void update(Dispatcher dispatcher) {
	}


	public static void CdPlay(CdPlayer cdPlayer){
		cdPlayer.setButtonPushed("Play button pushed");
	}

	public static void CdStop(CdPlayer cdPlayer){
		cdPlayer.setButtonPushed("Stop button pushed");
	}
}
