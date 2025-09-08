package Recursion_Easy_Problems;

public class Print1toNandNto1 {
    public static void main(String[] args) {
        // printing n to 1 and 1 to n
        print(5);
    }
    static void print(int n){

        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);


    }
}
