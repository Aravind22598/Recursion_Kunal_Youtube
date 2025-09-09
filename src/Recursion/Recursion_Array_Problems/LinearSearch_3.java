package Recursion.Recursion_Array_Problems;



public class LinearSearch_3 {
    public static void main(String[] args) {
        int[]arr={1,9,12,3,21,54,10,13,12,19};
        int target=12;
        System.out.println("Element is:"+target);
        System.out.println(linearSearch(arr,target,0));
        System.out.println("Element found at index : "+index(arr,0,target));
        System.out.println("Last index of the element is:"+lastIndex(arr,arr.length-1,target));
    }


    // it will return true or false
    static boolean linearSearch(int[]arr,int target,int index){
        if(index==arr.length){
            //it means reached end of the array
            return false;
        }


        if(arr[index]== target){
            return true;
        }
        else{
            // if element not found call for the next index
            return linearSearch(arr,target,index+1);
        }
    }



    // it will return the index of the element
    static int index(int[]arr,int i,int target){
        if(i==arr.length){
            return -1;
        }


        if(arr[i]==target){
            return i;
        }
        else{
            return index(arr,i+1,target);
        }
    }



    // this function will return the last index of an element
    static int lastIndex(int[]arr,int i,int target){
        if(i==-1){
            return -1;
        }


        if(arr[i]==target){
            return i;
        }
        else{
            return lastIndex(arr,i-1,target);
        }

    }
}
