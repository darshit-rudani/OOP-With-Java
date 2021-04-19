
public class Functionoverloading {
	
	public static void main(String args[]) {
		
		overloading obj = new overloading();
		obj.display();
		obj.display(2);
		obj.display((float)2.0);
		obj.display('a');
		obj.display(2,3);
		obj.display(2,(float)2.4);
	}
}
class overloading {
	
	void display() {
		
		System.out.println("No data types !!");
	}
	void display(int x) {
		
		System.out.println("Int data types !! "+x);
	}
	void display(float x) {
		
		System.out.println("float data types !! "+x);
	}	
	void display(char x) {
		
		System.out.println("char data types !! "+x);
	}	
	void display(int x,int y) {
		
		System.out.println("Int + Int data types !! "+x+" and "+y);
	}
	void display(int x,float y) {
		
		System.out.println("Int + Float data types !! "+x+" and "+y);
	}
}