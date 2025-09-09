package Recursion.Recursion_Easy_Problems;

public class ReverseANumber {
    public static void main(String[] args) {
        int n=123456789;
        System.out.println(reverse(n,0));
    }
    static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        int res=rev*10+(n%10);
        return reverse(n/10,res);
    }
}
