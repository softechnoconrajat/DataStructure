package ObserverPattern;

public class MobileListener implements ListenerInterface {
	
	MainClass watch ;
	
	public MobileListener(MainClass watch) {
		this.watch = watch;	
	}

	@Override
	public void updateDetails() {
		// TODO Auto-generated method stub
		MainClass.broadCastData();	
	}	
}
