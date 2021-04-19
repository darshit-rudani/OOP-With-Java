/*import java.util.*;
public class ex {
	
	public static void main(String args[]) {
		
		w obj = new w();
		x obj1 = new x();
		
		obj.insert();
		obj1.insert();
		obj.displayid();
		obj1.displaypno();
	}

}
class v{
	int id;
	long p_no;
	Scanner sc = new Scanner(System.in);
	void displayid() {
		System.out.println("Id is : "+id);
	}
	void displaypno() {
		System.out.println("Phone no is : "+p_no);
	}
}
class w extends v{
	public void insert() {
		System.out.println("Enter id : ");
		id = sc.nextInt();
	}
}
class x extends v{
	public void insert() {
		System.out.println("Enter Phone no : ");
		p_no =sc.nextLong();
	}
}

class college {
 public void move() {
  System.out.println("College is open");
 }
}
class univ extends college {
 public void move() {
  System.out.println("University is open too");
 }
}
public class ex {
 public static void main(String args[]) {
  college a = new college();
  college b = new univ();
  a.move();
  b.move();
 }
}*/

class Person{  
	int id;  
	String name;  
	Person(int id,String name){  
		this.id=id;  
		this.name=name;  
	}  
}  
class Emp extends Person{  
	float salary;  
	Emp(int id,String name,float salary){  
		super(id,name);//reusing parent constructor  
		this.salary=salary;  
}  
void display(){System.out.println(id+" "+name+" "+salary);}  
}  
class ex{  
	public static void main(String[] args){  
		Emp e1=new Emp(1,"ankit",45000f);  
		e1.display();  
	}
}  
