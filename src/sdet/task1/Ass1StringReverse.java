package sdet.task1;

import java.util.Scanner;

public class Ass1StringReverse {

	public static void main(String[] args) {
		 
		
		Scanner scanner=new Scanner(System.in);
		Ass1StringReverse ass1= new Ass1StringReverse();
		 
		System.out.println("Enter the String to Reverse:");
	 	String givenString=scanner.nextLine();
 		System.out.println("Rversed String"+ass1.reverseString(givenString));
 		scanner.close();
	}

	public  String reverseString(String givenString) {
		
		char[] given= givenString.toCharArray();
		String str = "";
				 
		for (int i = given.length-1; i>=0; i--) {
			str+=given[i];
		}
				 
		return str;
	}

}
