package Generics;

public class BubbleGeneric {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n=arr.length;

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j].compareTo(arr[j+1])>0) {
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
//        Integer[]arr = {5,4,3,2,1};
        String[] arr={"apple","doc","cow"};

        bubbleSort(arr);
        for (String num:arr) {
            System.out.print(num+" ");
        }
    }
}


