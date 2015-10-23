
public class HelloUser {
	String userName;
	
	public HelloUser(String user) {
		userName = user;
	}
		
	public void greetUser() {
		System.out.println(String.format("Hello %s!", userName));
	}
	
}
