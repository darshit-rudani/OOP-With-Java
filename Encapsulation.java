
public class Encapsulation {
	
	public static void main(String args[]) {
	      EncapTest encap = new EncapTest();
	      encap.setName("Droke");
	      encap.setAge(20);
	      encap.setIdNum("201803100810038");

	      System.out.println("Name : " + encap.getName());
	      System.out.println("Age : " + encap.getAge());
	      System.out.println("IdNum : " + encap.getIdNum());
	   }

}
class EncapTest {
	
	   private String name;
	   private String idNum;
	   private int age;
	   
	   public void setAge(int newAge) {
		   age = newAge;
	   }

	   public void setName(String newName) {
		   name = newName;
	   }

	   public void setIdNum( String newId) {
		   idNum = newId;
	   }

	   public int getAge() {
	      return age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getIdNum() {
	      return idNum;
	   }

	   
	}