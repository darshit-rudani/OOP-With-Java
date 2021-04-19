
public class Functionoverriding {
	
	public static void main(String args[]) {
		
		h v1 = new h();
		h v2 = new e();
		f v3 = new f();
		g v4 = new g();
		
		System.out.println("Value of method a : "+v1.value());
		System.out.println("Value of method b : "+v2.value());
		System.out.println("Value of method c : "+v3.value());
		System.out.println("Value of method d : "+v4.value());
	}

}

class h{
	
	int value() {
		return 0;
	}
}
class e extends h{
	
	int value() {
		return 10;
	}
}
class f extends h{
	
	int value() {
		return 20;
	}
}
class g extends h{
	
	int value() {
		return 30;
	}
}
