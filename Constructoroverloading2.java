//This Keyword

public class Constructoroverloading2 {

	private int id;
	
	Constructoroverloading2(){
		id = 100;
	}
	Constructoroverloading2(int a){
		this();
		id = id + a;
	}
	int getid() {
		return id;
	}
	public static void main(String args[]) {
		
		Constructoroverloading2 obj = new Constructoroverloading2(10);
		System.out.println(obj.getid());
	}
}
