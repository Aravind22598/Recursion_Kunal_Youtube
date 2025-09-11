package Recursion.Patterns.HeadRecursion;

public class PrintReverseString {
    public static void main(String[] args) {
        String s="aravind";
        System.out.println(s);
        printString(s,0);

    }
    static void printString(String s,int index){
        if(index==s.length()){
            return;
        }

        // first go till last index and print it
        printString(s,index+1);
        System.out.println(s.charAt(index));
    }

}
