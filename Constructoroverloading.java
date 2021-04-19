
public class Constructoroverloading {
	
	int age;
	int id;
	String name;
	
	Constructoroverloading(String n,int a)
	{
		name = n;
		age = a;
	}
	Constructoroverloading(String n,int a,int i)
	{
		name = n;
		age = a;
		id = i;
	}
	void display(){
		System.out.println("name is "+name+" age is "+age+" id is "+id);
	}
	
	public static void main(String args[]) {
		
		Constructoroverloading obj = new Constructoroverloading("Darshit",20);
		Constructoroverloading obj1 = new Constructoroverloading("Darshit",20,38);
		obj.display();
		obj1.display();
	}
	

}
