package loops_pgms;

import java.util.Scanner;

public class ReverseNumPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0) {
			rem= num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.print(rev);
		
		
		/*int num,rev;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0) {
			rev= num%10;
			num=num/10;
			System.out.print(rev);
		}*/

	}

}
