import java.util.*;

public class Interface {
	
	public static void main(String args[]) {
		
		impli obj = new impli();
		obj.insert();
		obj.getmarks();
		obj.display();
		obj.showmarks();
	}
}

interface inter{
	
	public void insert();
	public void display();
	public void getmarks();
	Scanner sc = new Scanner(System.in);
}

interface inter2{
	
	public void showmarks();
}

class impli implements inter, inter2{
	
	int age,math,phy,eng;
	String name;
	public void insert() {
			
			System.out.println("Enter Your name : ");
			name = sc.nextLine();
			System.out.println("Enter Your Age : ");
			age = sc.nextInt();
	}
	public void getmarks() {
		
			System.out.println("Enter Maths marks : ");
			math = sc.nextInt();
			System.out.println("Enter Physics marks : ");
			phy = sc.nextInt();
			System.out.println("Enter English marks : ");
			eng = sc.nextInt();
	}
	public void display() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}
	public void showmarks() {
		
		System.out.println("Maths marks : "+math);
		System.out.println("Physics marks : "+phy);
		System.out.println("English marks : "+eng);
	}
}

