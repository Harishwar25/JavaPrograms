package program;
import java.util.*;


public class Tables {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		float num = sc.nextFloat();
		float i=1;
	while(i<=10) {
		System.out.println(num + " x " + i +" = "+ num*i );
		i++;
	}
	}

}
