package sdet.task2;
public class Ass6RemoveSpace {

    public static void main(String[] args) {
        String str = "G  oo d Mor nin  g";
        System.out.println("Original sentence: " + str);

        str = str.replaceAll("\\s", "");
        System.out.println("After replacement: " + str);
    }
}