package Strings_pgms;

import java.util.Scanner;

public class VowelsConsonantsPgm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine().toLowerCase();

	        int vowels = 0, consonants = 0;

	        for (char ch : str.toCharArray()) {
	            if ("aeiou".contains(String.valueOf(ch))) {
	                vowels++;
	            } else if (ch >= 'a' && ch <= 'z') {
	                consonants++;
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }
}


