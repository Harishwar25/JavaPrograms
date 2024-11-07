package program;
import java.util.*;
public class hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password=1234;
		System.out.println("enter the password:");
		int dup=sc.nextInt();
		if(password==dup) {
			System.out.println("account is open ");
			
		}else {
			System.out.println("accout is closed ");
		}
        
		
	}

}
