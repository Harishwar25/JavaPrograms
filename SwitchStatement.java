package program;
import java.util.*;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int fee =0;
        System.out.println("enter vechical type :");
        String vec=sc.nextLine();
        
        switch(vec) {
        case"car":
        	fee=200;
        break;
        case"bus":
        	fee=500;
        	break;
        case"bike":
        	fee=100;
        break;
        default:
        	System.out.println("unknown vechical uoy can't park");
        	
        }
       System.out.println("your vechical is "+vec+" and charges are " +fee);
	}

}
