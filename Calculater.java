package program;
import java.util.*;
public class Calculater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int num1=sc.nextInt();
		System.out.print("enter the second number: ");
		int num2=sc.nextInt();
		System.out.println("enter the operater + , - , * , / :");
        char op = sc.next().charAt(0);
        
        if (op == '+')
        {
        	int sum = num1+num2;
        	System.out.println("Addition of " + num1 +" + "+ num2 +" = "+ sum);
        	
        }else if(op == '-') {
        	int sub = num1-num2;
        	System.out.println("substraction of " + num1 +" - "+ num2 +" = "+ sub);
        	
        }else if(op == '*') {
        	int  mul=num1*num2;
        System.out.println("Multiplication of "+ num1 + " * " + num2 + " = "+ mul );
        
        }
        else if (op == '/') {
        int div = num1/num2;
        System.out.println("Division of " +num1+" / "+num2+" = "+ div);
        
        }
        
	}

}
