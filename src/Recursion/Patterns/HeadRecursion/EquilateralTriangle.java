package Recursion.Patterns.HeadRecursion;

public class EquilateralTriangle {
    public static void main(String[] args) {
        int n=4;
      //  int nsp=n-1;
        printEquilateralTriangle(n,0,0);
    }
    static void printEquilateralTriangle(int r,int c,int nsp){
        if(r==0){
            return;
        }

        if(c<nsp){
            System.out.print(" ");
            printEquilateralTriangle(r,c+1,nsp);
        }
        else if(c<r){
            System.out.print("*");
            printEquilateralTriangle(r,c+1,nsp);
        }
        else{
            System.out.println();
            printEquilateralTriangle(r-1,0,nsp+1);
        }
    }
}
