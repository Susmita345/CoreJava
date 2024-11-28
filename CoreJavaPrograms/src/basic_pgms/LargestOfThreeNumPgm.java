package basic_pgms;

public class LargestOfThreeNumPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		num1=9;
		num2=12;
		num3=3;
		if(num1>num2 && num1>num3){
			System.out.println("Num1 "+num1+" is greater");
		}else if(num2>num1 && num2>num3){
			System.out.println("Num2 "+num2+" is greater");
		}else {
			System.out.println("Num3 "+num3+" is greater");
		}

	}

}
