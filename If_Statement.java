
import java.util.Scanner;

public class If_Statement {

	public static void main(String args[]) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			int age;

			System.out.println("Enter Your Age :- ");
			
			age = sc.nextInt();
			
			if(age > 20)
			{
				System.out.println("Age is above 20 years");
			}
		};
		
	}
}
