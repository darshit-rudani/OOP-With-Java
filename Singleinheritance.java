
import java.util.Scanner;

public class Singleinheritance {

	public static void main(String args[]) {
		
		yz obj = new yz();
		obj.insert();
		obj.display();
	}
}
class xy{
	
	String name;
	int age;
	
	void insert() 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter your name : ");
			name = sc.nextLine();
			System.out.println("Enter your Age : ");
			age = sc.nextInt();
		}
	}
}
class yz extends xy{
	
	void display() {
		System.out.println("your name is : "+name);
		System.out.println("your age is : "+age);
	}
}


