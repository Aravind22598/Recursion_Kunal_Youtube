package Recursion.Patterns;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={8,2,1,4,3,5,7,6,8,6};
        // here i is the no.of elements in the array
        bubbleSort(arr,arr.length-1,0);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }

    static void bubbleSort(int arr[],int i,int j){

        if(i==0 && j==0){
            return;
        }

        if( j<i ){
            if(arr[j]>arr[j+1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(arr,i,j+1);
        }
        else{
            bubbleSort(arr,i-1,0);
        }
    }

}
