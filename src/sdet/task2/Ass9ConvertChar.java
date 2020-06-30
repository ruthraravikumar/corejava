package sdet.task2;
public class Ass9ConvertChar {

    public static void main(String[] args) {
        char ch = 'c';
       
        String st = String.valueOf(ch);

        System.out.println("The string is: " + st);
        
        char c= st.charAt(0);
        
        System.out.println("Character is "+ c);
    }
}