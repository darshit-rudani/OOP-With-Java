
import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner (System.in)) {
		
			int age;
			
			System.out.println("Enter age : ");
			
			age = sc.nextInt();
			
			if(age > 18)
			{
				System.out.println("Age is above 18 !!");
			}
			else
			{
				System.out.println("Age is below 18 !!");
			}
		};
	}
}
