package Strings_pgms;
import java.util.Scanner;
public class PalindromeCheckPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0,rev,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
		num=sc.nextInt();
		rev=num;
		while(num>0){
			rem=num%10;
			sum=rem+(sum*10);
			num=num/10;
		}
		if(rev==sum) {
		System.out.println(true);
	    }else {
		System.out.println(false);
		}
	}



}


