public class MergeSort {

    public static void mergeSort(String[] arr){
        int n= arr.length;

        if(n==0 || n==1){
            return;
        }
        int m=n/2;
        String[] left=new String[m];
        String[] right=new String[n-m];

        System.arraycopy(arr, 0, left, 0, m);
        if (n - m >= 0) System.arraycopy(arr, m, right, 0, n - m);

        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);

    }

    public static void merge(String[] arr, String[] left, String[] right){
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
        String[] arr={"apple","doc","hen","cow"};
        mergeSort(arr);
        for(String i:arr){
            System.out.println(i);
        }
    }
}
