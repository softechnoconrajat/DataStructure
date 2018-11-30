package ObserverPattern;

public class Caller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainClass mainObj = new MainClass();
		MobileListener mL = new MobileListener(mainObj);
		TvOSListener tvOS = new TvOSListener(mainObj);
		
		
		mainObj.broadCastData();
				
	}

}
