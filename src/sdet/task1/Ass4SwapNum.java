package sdet.task1;

import java.util.Scanner;

public class Ass4SwapNum{

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int[] digit1,digit2;
		
		
		System.out.println("1.Enter the number of Test cases");
		int testcase=scanner.nextInt();
		digit1=new int[testcase];
		digit2=new int[testcase];
		
		for(int i=0;i<testcase;i++) {
			System.out.println("Test case numbers "+(i+1));
			digit1[i]=scanner.nextInt();
			digit2[i]=scanner.nextInt();
		}
		
		 
		System.out.println("Results");
		
		for(int i=0;i<testcase;i++) {
			System.out.println(digit2[i]+" "+digit1[i]);
		}
		
		scanner.close();
	}

}
