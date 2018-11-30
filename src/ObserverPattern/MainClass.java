package ObserverPattern;

import java.util.List;
import java.util.ArrayList;

public class MainClass implements Main {

	List<ListenerInterface> arrayObj = new ArrayList<ListenerInterface>();
	
	@Override
	public void add(ListenerInterface obj) {
		// TODO Auto-generated method stub
		arrayObj.add(obj);
	}

	@Override
	public void delete(ListenerInterface obj) {
		// TODO Auto-generated method stub
		arrayObj.remove(obj);
		
	}

	@Override
	public void toNotify() {
		// TODO Auto-generated method stub
		for(ListenerInterface i:arrayObj) {
			
			i.updateDetails();

		}	
	}
	
	public void broadCastData() {
		
		System.out.println("Returning Data");
		
		toNotify();
		
		
	}
	

}
