package Recursion_Easy_Problems;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        System.out.println(nthFibonacci(n));
    }
    static int nthFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
}
