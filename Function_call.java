
public class Function_call {

	public static void main(String[] args) {
		
		int Marks[] = {56,67,98,99,25,67};
		int Highest_marks = maximum(Marks);
		
		System.out.println("Highest Marks Is : "+ Highest_marks);
	}
	
	public static int maximum(int[] numbers) {
		
		int marks = numbers[0];
		int num[]=numbers;
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>=marks)
			{
		        marks = num[i];
			}
		}
		return marks;
	}
}
