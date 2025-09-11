package Recursion.Patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSortSirVersion {
    public static void main(String[] args) {
        int[]arr={9,8,7,6,5,4,3,2,1,10};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr,int r,int c,int max){

        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c]>arr[max]){
                max=c;
            }
            selection(arr,r,c+1,max);
        }
        else{
            int temp=arr[c-1];
            arr[c-1]=arr[max];
            arr[max]=temp;
            selection(arr,r-1,0,0);
        }
    }
}
