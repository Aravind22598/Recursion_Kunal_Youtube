package Recursion.Patterns;

public class TrianglePattern {
    public static void main(String[] args) {


        printPattern(10,0);
    }
    static void printPattern(int rows,int cols){
        // base case
        if(rows==0 && cols==0){
            return;
        }


        if(rows>cols){
            System.out.print("*");
            printPattern(rows,cols+1);
        }
        else{
            // it means finished printing a row
            // so now go to next row
            System.out.println();
            printPattern(rows-1,0);
        }
    }
}
