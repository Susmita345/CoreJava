package loops_pgms;

import java.util.Scanner;

public class SumOfDigPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using while loop
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		/*while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);*/
		
		//Using for loop
		for(int i=1;i<=num;i++){
            //int sum=(i*(i+1))/2;
            sum=sum+i;
        }
            System.out.println("Sum :"+sum);

	}

}
