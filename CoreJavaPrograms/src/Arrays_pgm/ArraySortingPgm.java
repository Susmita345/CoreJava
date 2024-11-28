package Arrays_pgm;

import java.util.Scanner;

public class ArraySortingPgm {

	public static void main(String[] args) {;
		int arr[]=new int[5];
		//int num = 5;
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorted array is:");
	    for(int i=0;i<5;i++){
	        for(int j=i;j<5;j++){
	            if(arr[i]>arr[j]){
	               int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	        System.out.println(arr[i]);
	    }
	    }

}


