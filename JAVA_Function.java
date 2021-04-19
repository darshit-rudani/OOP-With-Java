
public class JAVA_Function {

	public static void main(String args[]) {
		
		int a = 20,b = 10;
		int max=maximum(a,b);
		int min=minimum(a,b);
		
		System.out.println("maximum value from a and b is : "+max);
		System.out.println("minimum value from a and b is : "+min);

	}
	
	public static int maximum(int a,int b) {
		
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int minimum(int a,int b) {
			
			if(a<b)
			{
				return a;
			}
			else
			{
				return b;
			}
		}
}
