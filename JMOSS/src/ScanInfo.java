import java.util.Scanner;


public class ScanInfo {
	
	String[] EmailArray = new String[1000];
	String[] SuburbArray = new String[1000];
	
	public void scaninput(int clientID) {
		System.out.println("Enter customer's Email: ");
		Scanner scanner = new Scanner(System.in);
		String email = scanner.nextLine();
		EmailArray[clientID] = email;
		System.out.println("Enter customer's Suburb: ");
		String suburb = scanner.nextLine();
		SuburbArray[clientID] = suburb;

	}
	public void printemail() {
		for(int i=0;EmailArray[i]!=null;i++){
			System.out.println("Customer's Email is: "+EmailArray[i]);
		}
		
	}
}
