package Recursion.Patterns.HeadRecursion;

public class BinaryRepresentationOfANumber {
    public static void main(String[] args) {
        binary(9);

    }

    static void binary(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }

        // first divide continuously until reach 1
        binary(n/2);
        System.out.print(n%2+" ");
    }
}
