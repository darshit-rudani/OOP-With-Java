import java.util.Scanner;
 
public class Studentdata
{
      public static void main(String args[])
      {
          String name;
          int roll, math, phy, eng;
           
          try (Scanner SC = new Scanner(System.in)) {
			  System.out.print("Enter Name: ");
			  name=SC.nextLine();
			  System.out.print("Enter Roll Number: ");
			  roll=SC.nextInt();
			  System.out.print("Enter marks of Maths : ");
			  math=SC.nextInt();
			  System.out.print("Enter marks of Physics : ");
			  phy=SC.nextInt();
			  System.out.print("Enter marks of English : ");
			  eng=SC.nextInt();
         }
           
          int total=math+eng+phy;
          float perc=total/3;
           
          System.out.println("Roll Number: " + roll);
          System.out.println("Student Name: " + name);
          System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
          System.out.println("Total Of Marks: "+total);
          System.out.println("Percantage: "+perc+"%");
            
      }
          
}
