import java.util.Scanner;

public class Abstraction {
	
	public static void main(String args[]) {
		
		bb obj = new bb();
		obj.insert();
		obj.display();
	}
}
abstract class aa{
	
	String name;
	int age;
	
	abstract void display();
	
	void insert() {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter Your name : ");
			name = sc.nextLine();
			System.out.println("Enter Your Age : ");
			age = sc.nextInt();
		}
	}
}

class bb extends aa{
	
	void display() {
		
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
		
	}
}


