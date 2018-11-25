package ObserverPattern;

public class TvOSListener implements ListenerInterface {
	
	MainClass watch ;
	
	public TvOSListener(MainClass watch) {
		this.watch = watch;
	}

	@Override
	public void updateDetails() {
		// TODO Auto-generated method stub
		MainClass.broadCastData();
		
	}	
}
