import java.util.HashMap;
import java.util.Map;


public class ClientInfo {
	String email = null;
	String suburb = null;
	Map<String, String> customerinfo = new HashMap<String, String>();
	
	public void store(String[] args) {
		
		Boolean loop = true;
		while(loop) {
			if(email == null){
				loop = false;
			}
			else{
				customerinfo.put(email,suburb);
			}
			
		}
	}
	public void showSuburb(String email) {
		System.out.println(customerinfo.get(email));
	}
}
