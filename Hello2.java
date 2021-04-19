import java.util.Scanner;

public class Hello2 {

		public static void main(String[] args) {
			String Name;
				
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter Name : ");
 
				Name=sc.nextLine();
			}
		    System.out.println("Hello "+Name);
		}
			
			
}
	

