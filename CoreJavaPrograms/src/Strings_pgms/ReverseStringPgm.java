package Strings_pgms;
import java.util.Scanner;
public class ReverseStringPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        String reversed = "";
		        for (int i = input.length() - 1; i >= 0; i--) {
		            reversed += input.charAt(i);
		        }

		        System.out.println("Reversed string: " + reversed);
		    }



	}

