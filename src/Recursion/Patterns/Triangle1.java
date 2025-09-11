package Recursion.Patterns;

public class Triangle1 {
    public static void main(String[] args) {

        printTriangle(3,0);
    }

    static void printTriangle(int i,int j){
        if(i==0){
            return;
        }

        //first go deep
        if(j<i){
            printTriangle(i,j+1);
            System.out.print("*");
        }
        else{
            printTriangle(i-1,0);
            System.out.println();
        }
    }
}
