package sample;

import java.util.Scanner;

public class Calculatorexe {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the operator ");
		String opp=scan.next();
		System.out.println("enter the numbers ");
		int a,b,c;
		a=scan.nextInt();
		b=scan.nextInt();
		switch(opp) {
		case "add":
			c=a+b;
			System.out.println("Answer is"+c);
			break;
		case "sub":
			c=a-b;
			System.out.println("Answer is"+c);
			break;
		case "mul":
			c=a*b;
			System.out.println("Answer is"+c);
			break;
		case "div":
			c=a/b;
			System.out.println("Answer is"+c);
			break;
		case "mod":
			c=a%b;
			System.out.println("Answer is"+c);
			break;
		default:
		System.out.println("enter the valid operator");
		
		
		}
		
		
	}	
}
	
	
	
	
	


