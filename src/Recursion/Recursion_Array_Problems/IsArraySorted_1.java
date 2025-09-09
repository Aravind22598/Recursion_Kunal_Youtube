package Recursion.Recursion_Array_Problems;

public class IsArraySorted_1 {
    public static void main(String[] args) {
        int arr[]={1,3,3,5,7,9};
        System.out.println(isArraySorted(arr,0));
    }
    static boolean isArraySorted(int []arr,int index){
        if(index==arr.length-1){
            return true;
        }

        // break the problem : first check for the first pair and ask the same function for remaining
        if(arr[index]<=arr[index+1]){
            return isArraySorted(arr,index+1);
        }
        else{
            // if anywhere the elements are not in order return false
            return false;
        }
    }
}
