package sdet.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ass4FreqCharacter {

	private static Map<Character, Integer> lib=new HashMap<>();
	
	public static void main(String[] args) {
		String str="Ruthra Ravikumar";
		
        char[] strs=str.toCharArray();
		
		for(char c:strs) {			
			if(c==' ')
				continue;
			
			if(validate(c))
				appendThisChar(c);
			else
				addThisChar(c);
		}
		
		display();
		
	}

	private static void display() {
		for(Entry<Character, Integer> entry:lib.entrySet()) {
			System.out.println("Frequency of "+entry.getKey()+"  :"+entry.getValue());
		}
		
	}

	private static void appendThisChar(char chr) {
		lib.replace(chr, (lib.get(chr)+1));		
	}

	private static boolean validate(char chr) {
		return lib.containsKey(chr);
	}

	private static void addThisChar(char chr) {
		lib.put(chr, 1);		
	}
	
	
	

}
