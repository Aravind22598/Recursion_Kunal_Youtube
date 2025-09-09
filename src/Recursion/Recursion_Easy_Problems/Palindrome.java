package Recursion.Recursion_Easy_Problems;

public class Palindrome {
    public static void main(String[] args) {
        String str="aravind";
       // String str="ababa";

//        boolean res=palindromeOrNot(str);
//        if(res){
//            System.out.println("Palindrome");
//        }
//        else {
//            System.out.println("Not a palindrome");
//        }
//
//        System.out.println("Calling reverse string function using recursion: ");
//        System.out.println(reverse(str,0,str.length()-1));
        System.out.println(palindromeUsingRecursion(str,0,str.length()-1));


    }
    static boolean palindromeOrNot(String str){

        char[]arr=str.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        String rev=String.valueOf(arr);
        System.out.println(rev);
        if(str.equals(rev)){
            return true;
        }
        return false;
    }


    static String reverse(String s,int l, int r){
        // base condition
        if(l>r){
            return s;
        }

        //first convert the string to array
        char[]arr=s.toCharArray();
        // swap the characters at l and r
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        //call same function for remaining string l++ and r--
        l++;
        r--;
       return  reverse(String.valueOf(arr),l,r);
    }


    // need to update the code wrong
    static boolean palindromeUsingRecursion(String s,int l,int r){
        // base condition
        if(l>r){
            return true;
        }

        //first convert the string to array
        char[]arr=s.toCharArray();
        // swap the characters at l and r
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        //call same function for remaining string l++ and r--
        l++;
        r--;
        return  palindromeUsingRecursion(String.valueOf(arr),l,r);
    }
}
