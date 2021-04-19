
public class Hierarchicalinheritance {
	
	public static void main(String args[]) {
		
		heri obj = new heri();
		tance obj1 = new tance();
		
		obj.a();
		obj1.a();
	}

}
class in {
	void a() {
		System.out.println("Class A");
	}
}
class heri extends in {
	
	void b() {
		System.out.println("Class B");
	}
	
}
class tance extends in {
	
	void c() {
		System.out.println("Class C");
	}
}
