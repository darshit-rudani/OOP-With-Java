
public class Datatype_int {

	static int count = 0;
	public void increment()
	{
  	   count++;	
	};
	
	public static void main(String[] args) {
		
		Datatype_int obj1 = new Datatype_int();
		Datatype_int obj2 = new Datatype_int();
		
		obj1.increment();
		obj2.increment();
		
		//System.out.println(obj1.count);
		//System.out.println(obj2.count);
		
		System.out.println(Datatype_int.count);
		System.out.println(Datatype_int.count);
	}
}
