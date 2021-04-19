
public class Superkeyword {
	
	public static void main(String args[]) {	
		
		word v1 = new word();
		v1.display();
	}
	 
}

class superkey {
	
	int superkey = 10;
	void display() {
		System.out.println("Value of super class is : "+superkey);
	}
}
class word extends superkey{
	
	int superkey = 20;
	void display() {
		System.out.println("Value of simple class is : "+superkey);
		super.display();
	}
}