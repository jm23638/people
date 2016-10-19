import javax.swing.JOptionPane;
public class Naruto {  
	public static void main(String[] args) {
		
		String username = "Jmoya23638";
		String password = "Jonathanmoya12";
		String login = JOptionPane.showInputDialog("Enter Username");
		if (username.equalsIgnoreCase(login)) {
			String input = JOptionPane.showInputDialog("Enter Password:");
		if (input.equals(password)) {
			System.out.println("Welcome " + username );
		} else {
			System.out.println("Wrong username or passwordh");
		}
		} else {
			System.out.println("Are you even a person?");
	}
	}
}
