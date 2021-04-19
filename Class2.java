import java.util.Scanner;
public class Class2 {

	String name;
	public void setname() {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter Your name");
			name=sc.nextLine();
		}
	}
	public String getname() {
		
		return name;
	}
	
	public static void main(String args[]) {
		
		Class2 name = new Class2();
		name.setname();
		System.out.println("Hello "+name.getname());
	}
}
