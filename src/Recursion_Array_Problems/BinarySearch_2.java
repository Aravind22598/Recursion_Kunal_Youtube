package Recursion_Array_Problems;

public class BinarySearch_2 {
    public static void main(String[] args) {
        int[]arr={1,2,5,12,16,20,24};
        int target=24;
       int res= binarySearch(arr,0,arr.length-1,target);
        if(res==-1){
            System.out.println("Element not found!!!!!!!!");
        }
        else{
            System.out.println("Element found at index:"+res);
        }
    }

    static int binarySearch(int[]arr,int l,int h,int target){
        // base condition
        if(l>h){
            return -1;
        }
        int  mid=(l+h)/2;
        if(target>arr[mid]){
            return binarySearch(arr,mid+1,h,target);
        }
       else if(target<arr[mid]){
           return binarySearch(arr,l,mid-1,target);
        }
        else {
            return mid;
        }
    }
}
