package sdet.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Ass3ArrayGreatestNum {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Ass3ArrayGreatestNum ass3=new Ass3ArrayGreatestNum();
		int[] data,queries;
		
		System.out.println("1.Enter the number of Elements in array and queries");
		int arraySize=scan.nextInt();
			data=new int[arraySize];
		int querySize=scan.nextInt();
		queries=new int[querySize];
		
		System.out.println("2.Enter Array Elements");
		for(int i=0;i<arraySize;i++) {
			data[i]=scan.nextInt();
		}
		
		System.out.println("3.Enter Query Elements");
		for(int i=0;i<querySize;i++) {
			queries[i]=scan.nextInt();
		}
		
		System.out.println("\nResults:");
		Arrays.sort(data);
		for(int i=0;i<querySize;i++) {
			System.out.println(ass3.findLargeNumberinArray(data,queries[i]));
		}
		
		scan.close();
	}

	private int findLargeNumberinArray(int[] data, int max) {
		for(int i=0;i<data.length;i++) {
			 if(data[i]>=max) {				
				 return data[i-1];
			 }
		}		 
		return data[data.length-1];
	}

}
