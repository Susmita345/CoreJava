package Arrays_pgm;

import java.util.Scanner;

public class MaxMinNumPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
        int i,max,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 values:");
        for(i=0;i<5;i++){
            arr[i]=sc.nextInt();
            }
        
        max=arr[0];
        min=arr[0];
        for(i=0;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
          
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println("The max element is:"+max);
        System.out.print("The min element is:"+min);

		

	}

}
