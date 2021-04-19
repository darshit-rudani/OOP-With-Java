
public class Class {

	String name;
	public void setname(String n) {
		
		name = n;
	}
	public String getname() {
		
		return name;
	}
	
	public static void main(String args[]) {
		
		Class name = new Class();
		name.setname("Darshit");
		System.out.println("Hello "+name.getname());
	}
}
