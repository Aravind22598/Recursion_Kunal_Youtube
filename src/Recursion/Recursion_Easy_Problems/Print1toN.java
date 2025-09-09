package Recursion.Recursion_Easy_Problems;

public class Print1toN {
    public static void main(String[] args) {
        printNum(10);
    }
    static void printNum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
       printNum(n-1);
        System.out.println(n);
    }

}
