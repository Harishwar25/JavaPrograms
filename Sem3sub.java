package program;
import java.util.*;
public class Sem3sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter the subject");
	    String sub=sc.next();
	    System.out.println("enter the " + sub + " total marks out of 100");
	    int mk = sc.nextInt();
	    if(mk>=80 && mk<=100)
	    {
	    	System.out.println("you get 80% and 10 pointer and O Grade");
	    }
	    else if(mk>=70 && mk<=79)
	     {
	         System.out.println("you get 70% and 9 pointer and A+ Grade");
	     }
	     else if(mk>=60 && mk<=69)
	      {
	         System.out.println("you get 60% and 8 pointer and A Grade");
	      }
	      else if(mk>=55 && mk<=59)
	      {
	         System.out.println("you get 550% and 7 pointer and B+ Grade");
	      }
	      else if(mk>=50 && mk<=55)
	      {
	         System.out.println("you get 50% and 6 pointer and B Grade");
	      }
	      else if(mk>=45 && mk<=49)
	      {
	         System.out.println("you get 45% and 5 pointer and C Grade");
	      }
	      else if(mk>=40 && mk<=44)
	      {
	         System.out.println("you get 40% and 4 pointer and D Grade");
	      }
	      else if (mk<=40)
	    	  System.out.println("you are faild ! ");
	}
	

}
