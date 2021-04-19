// 2.Parameterized Constructor

public class Parameterized {
	
	float result;

	Parameterized(int a){
		
		// area of Circle
		
		result = (float) 3.14 * a * a;
		System.out.println("Area of Circle for redius "+a+" is "+result);
		
	}
	Parameterized(int a,int b){
		
		// area of Rectangle
		
		result = (float) a * b;
		System.out.println("Area of rectangle for length is "+a+" and Width is "+b+" is "+result);
		
	}

	public static void main(String args[]) {
		
		new Parameterized(10);
		new Parameterized(10,20);
	}
}
