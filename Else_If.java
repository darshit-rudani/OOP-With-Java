
import java.util.Scanner;

public class Else_If {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner (System.in)) {
			
			int age;
			
			System.out.println("Enter age : ");
			
			age = sc.nextInt();
	
			if(age > 20 && age < 40)
			{
				System.out.println("Age is Between 20 and 40 !!");
			}
			else if(age > 40 && age < 60)
			{
				System.out.println("Age is Between 40 and 60 !!");
			}
			else
			{
				System.out.println("Not Match !!!!");
			}
		};
	}
}
