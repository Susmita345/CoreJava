package basic_pgms;

public class FibonacciPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,next,n;
		num1=0;
		num2=1;
		n=10;
		for(int i=2;i<n;i++) {
			System.out.println(num1+"");
			next = num1+num2;//0+1=1, 1+1=2, 
			num1= num2;
			num2=next;
		}

	}

}
