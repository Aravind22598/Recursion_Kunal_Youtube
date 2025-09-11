package Recursion.Patterns.HeadRecursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }


        // first find sum of n-1 elements
        int x=sum(n-1);
        return x+n;
    }
}
