package Recursion.Recursion_Easy_Problems;

public class ProductOfNto1 {
    // it is nothing but factorial question
    public static void main(String[] args) {
        System.out.println(product(5));
    }
    static int product(int n){
        if(n==1 ||n==0){
            return 1;
        }
        int res=product(n-1);
        return res*n;
    }
}
