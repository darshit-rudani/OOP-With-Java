
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner (System.in)) {
			
			int age;
			
			System.out.println("Enter age : ");
			
			age = sc.nextInt();
			
			switch(age)
			{
				case 10:
					System.out.println("Age is 10");
			        break;	
			        
				case 20:
					System.out.println("Age is 20");
			        break;	
			        
				case 30:
					System.out.println("Age is 30");
			        break;	
			        
				case 40:
					System.out.println("Age is 40");
			        break;	
			        
				case 60:
					System.out.println("Age is 60");
			        break;	
			        
			    default:
			        System.out.println("Not Match !!");
			        break;
			}
		};
	}
}
