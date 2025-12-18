package Generics;

public class InsertionGeneric {
    public static <T extends Comparable<T>> void inSort(T[] arr){
        for (int i=1;i< arr.length;i++){
            T key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j].compareTo(key)>0){
                arr[j+1]=arr[j];
                j--;
            }arr[j+1]=key;
        }
    }

    public static void main(){
//        String[] arr={"apple","doc","hen","cow"};
        Integer[] arr={5,7,2,6,4,9};
        inSort(arr);
        for(Integer word:arr){
            System.out.println(word);
        }
    }
}
