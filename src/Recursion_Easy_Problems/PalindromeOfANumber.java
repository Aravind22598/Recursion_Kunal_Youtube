package Recursion_Easy_Problems;
import Recursion_Easy_Problems.ReverseANumber;

public class PalindromeOfANumber {
    public static void main(String[] args) {
        int n=12321;
        System.out.println(palindrome(n));



    }
    static boolean palindrome(int n){
        if(n==ReverseANumber.reverse(n,0)){
            return true;
        }
        else{
            return false;
        }
    }
}
