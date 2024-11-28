package loops_pgms;

import java.util.Scanner;

public class MultiplicationTablePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,mul;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			mul=num*i;
			System.out.println(mul);
		}

	}

}
