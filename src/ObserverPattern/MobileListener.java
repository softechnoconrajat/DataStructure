package ObserverPattern;

public class MobileListener implements ListenerInterface {
	
	MainClass watch ;
	
	public MobileListener(MainClass watch) {
		this.watch = watch;	
		watch.add(this);
	}

	@Override
	public void updateDetails() {
		// TODO Auto-generated method stub
		//MainClass.broadCastData();
		System.out.println("Mobile Listener Updated.");
	}	
}
