package basic_pgms;

import java.util.Scanner;

public class SimpleCalculatorPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,result;
		num1=2;
		num2=4;
		String choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice: ");
		choice =sc.next();
		switch(choice){
			case "+":
				result=num1+num2;
				System.out.println(result);
				break;
			case "-":
				result = num1-num2;
				System.out.println(result);
				break;
			case "*":
				result = num1*num2;
				System.out.println(result);
				break;
			case "/":
				result = num1/num2;
				System.out.println(result);
				break;
			default:
				System.out.println("Operation is invalid");
				break;
				
			
		}

	}

}
