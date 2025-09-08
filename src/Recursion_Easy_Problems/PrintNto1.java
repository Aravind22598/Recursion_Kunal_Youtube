package Recursion_Easy_Problems;

public class PrintNto1 {
    public static void main(String[] args) {

        printN(10);
    }
    static void printN(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printN(n-1);

    }
}
