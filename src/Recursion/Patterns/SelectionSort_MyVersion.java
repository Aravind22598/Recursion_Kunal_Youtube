package Recursion.Patterns;

import java.util.Arrays;

public class SelectionSort_MyVersion {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,7,6,9,8,5};
       // int[]arr={4,1,3,2};
       // int[]arr={2};
        selection_sort(arr,arr.length,0,Integer.MIN_VALUE,0);
        System.out.println(Arrays.toString(arr));

    }
    static void selection_sort(int[]arr,int r,int c,int max,int max_idx){
            if(r==0){
                return;
            }

        if(c<r){
            if(arr[c]>max){
                max=arr[c];
                max_idx=c;
            }

            selection_sort(arr,r,c+1,max,max_idx);
        }
        else{
            // swap the max_idx element with the last element
            int temp=arr[max_idx];
            arr[max_idx]=arr[c-1];
            arr[c-1]=temp;

            selection_sort(arr,r-1,0,Integer.MIN_VALUE,0);
        }
    }
}
