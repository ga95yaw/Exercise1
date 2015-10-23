/**
 * 
 */
import java.util.Scanner;
/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		
	    String username = scanner.next();
	    
	    HelloUser helloUser = new HelloUser(username);
		helloUser.greetUser();
	}
	

}


