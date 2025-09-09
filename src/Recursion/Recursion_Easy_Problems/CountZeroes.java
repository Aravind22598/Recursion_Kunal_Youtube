package Recursion.Recursion_Easy_Problems;

public class CountZeroes {
    public static void main(String[] args) {
        int n=300203000;
        System.out.println(countZeroes(n));
    }
    static int countZeroes(int n){
        if(n==0){
            return 0;
        }
        int count=0;
        if(n%10==0){
            count++;
        }
        return count+countZeroes(n/10);
    }
}
