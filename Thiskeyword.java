// 1. if not used this keyword then output is "0 null o"

/*
class Thiskeyword{  

	public static void main(String args[]) {  

			da s1=new da(111,"ankit",5000f);  
			da s2=new da(112,"sumit",6000f);  
			s1.display();  
			s2.display();  
	}
}  
class da {  
	int rollno;  
	String name;  
	float fee;  
	
	da(int rollno,String name,float fee){  
		rollno=rollno;  
		name=name;  
		fee=fee;  
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}  
}
*/

// 2.useing This keyword

class Thiskeyword{  

	public static void main(String args[]) {  

			da s1=new da(111,"ankit",5000f);  
			da s2=new da(112,"sumit",6000f);  
			s1.display();  
			s2.display();  
	}
}  

class da { 

	int rollno;  
	String name;  
	float fee;  
	
	da(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  


// 3.without this keyword
/*

class Thiskeyword{  

	public static void main(String args[]){  
		
		da s1=new da(111,"ankit",5000f);  
		da s2=new da(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}
} 

class da{  
	
	int rollno;  
	String name;  
	float fee;  
	
	da(int r,String n,float f){  
	
		rollno=r;  
		name=n;  
		fee=f;  
	}  
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
  

 */

