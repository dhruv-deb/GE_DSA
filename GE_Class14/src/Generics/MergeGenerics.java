package Generics;

import java.util.Arrays;

public class MergeGenerics {

    public static <T extends Comparable<T>> void mergeSort(T[] arr){
        int n= arr.length;;

        if(n==0 || n==1){
            return;
        }
        int m=n/2;
        T[] left= Arrays.copyOfRange(arr, 0, m);
        T[] right=Arrays.copyOfRange(arr, m, n);

//        System.arraycopy(arr, 0, left, 0, m);
//        if (n - m >= 0) System.arraycopy(arr, m, right, 0, n - m);

        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);

    }

    public static <T extends Comparable<T>> void merge(T[] arr, T[] left, T[] right){
        int i=0;int j=0; int k=0;
        while(i< left.length && j< right.length){
            if(left[i].compareTo(right[j])<=0){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }k++;
        }
        while(i<left.length){
            arr[k]=left[i];
            k++;i++;
        }
        while(j<right.length){
            arr[k]=right[j];
            k++;j++;
        }
    }

    public static void main(){
//        String[] arr={"apple","doc","hen","cow"};
//        mergeSort(arr);
//        for(String i:arr){
//            System.out.println(i);
//        }
        Integer[] num={8,6,2,5,9,7,4};
        mergeSort(num);
        for(Integer i:num){
            System.out.println(i);
        }
    }
}

