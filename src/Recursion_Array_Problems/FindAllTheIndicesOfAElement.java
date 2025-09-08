package Recursion_Array_Problems;

import java.util.ArrayList;

public class FindAllTheIndicesOfAElement {
    public static void main(String[] args) {
        int arr[]={1,2,12,13,4,12,5,7,9,12};
        int target=12;
        System.out.println("All the indices having element "+target+" are");
//        findAllIndex(arr,target,0);
//        System.out.println(l);
//        System.out.println("-----------");
//        System.out.println(findAllIndex_UsingExtraArgument(arr,target,0,new ArrayList<Integer>()));

        System.out.println(findAllIndices(arr,target,0));
    }


    static ArrayList<Integer> l=new ArrayList<>();
    static void findAllIndex(int[]arr,int target,int i){
        //base case
        if(i==arr.length){
            return;
        }

        if(arr[i]==target){
            l.add(i);
        }
        findAllIndex(arr,target,i+1);
    }



    // passing ArrayList<>() reference as an argument without creating a arraylist object outside
    static ArrayList<Integer> findAllIndex_UsingExtraArgument(int[]arr,int target,int i,ArrayList<Integer> l){
        if(i==arr.length){
            return l;
        }

        if(arr[i]==target){
            l.add(i);
        }
        return findAllIndex_UsingExtraArgument(arr,target,i+1,l);
    }


    // creating a ArrayList<>() object inside a function body without passing it as and argument
    static ArrayList<Integer> findAllIndices(int[]arr,int target,int i){
        ArrayList<Integer> l=new ArrayList<>();
        if(i==arr.length){
            return l;
        }


        // this will contain answer for this function only
        if(arr[i]==target){
            l.add(i);
        }

//       l.addAll(findAllIndices(arr,target,i+1));

        ArrayList<Integer> answerFromAboveFunctionCalls=findAllIndices(arr,target,i+1);
        l.addAll(answerFromAboveFunctionCalls);
        return l;
    }

}
