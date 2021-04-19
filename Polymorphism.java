
public class Polymorphism {
	
	public static void main(String args[]) {
		
		Student s1 = new Student();
		Teacher s2 = new Teacher();
		s1.Droke();
		s2.Droke();
		
	}
}
class Data {
	
	void Droke() {
		
		System.out.println("Hello  ");
		System.out.println("roke.... ");
		
	}
}
class Student extends Data {
	
	void Droke() {
		
		System.out.println("Hello  ");
		System.out.println("Droke.... ");
		
	}
}
class Teacher extends Data{
	
	void Droke() {
		System.out.println("Hello  ");
		System.out.println("Aroke.... ");
	}
}
