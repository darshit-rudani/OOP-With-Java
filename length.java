import java.util.Scanner;

public class length {

	public static void main(String[] args) {
		
		String s1,s2;
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter string s1 :");
			s1 = sc.nextLine();
			
			System.out.print("Enter string s2 :");
			s2 = sc.nextLine();
			
			int l1 = s1.length();
			int l2 = s2.length();
			
			System.out.println("String 1 : "+s1);
			System.out.println("Length of s1 : "+l1);
			System.out.println("String 2 : "+s2);
			System.out.println("Length of s2 : "+l2);
		};	
	}
}
