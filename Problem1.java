package Tandemloop;
import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter two integers: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		System.out.println("Enter the operation on Calculator: ");
		String s1=input.next();
		switch(s1) {
		case "+":{
			System.out.println("Addition is: "+(a+b));
			break;
		}
		case "-":{
			System.out.println("Subtraction is: "+(a-b));
			break;
		}
		case "*":{
			System.out.println("Multiplication is: "+(a*b));
			break;
		}
		case "/":{
			System.out.println("Devition is: "+(a/b));
			break;
		}
		}
		

	}

}
