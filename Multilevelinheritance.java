
import java.util.*;
public class Multilevelinheritance {

	public static void main(String args[]) {
		
		show obj = new show();
		obj.insert();
		obj.display();
	}
}
class variable{
	
	String name;
	int age;
}
class value extends variable{

	void insert() {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Your name : ");
			name = sc.nextLine();
			System.out.println("Enter your age : ");
			age = sc.nextInt();
		}
	}
}
class show extends value{
	
	void display() {
		
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}
}
