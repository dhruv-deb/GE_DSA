public class InsertionSort {
    public static void inSort(String[] arr){
        for (int i=1;i< arr.length;i++){
            String key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j].compareTo(key)>0){
                arr[j+1]=arr[j];
                j--;
            }arr[j+1]=key;
        }
    }

    public static void main(){
        String[] arr={"apple","doc","hen","cow"};
        inSort(arr);
        for(String word:arr){
            System.out.println(word);
        }
    }
}
