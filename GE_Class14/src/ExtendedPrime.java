import java.util.*;

public class ExtendedPrime extends Prime{
    public static boolean isPalin(int num){
        int temp=num;
        int rev=0;
        while (temp>0){
            int last=temp%10;
            rev=rev*10+last;
            temp/=10;
        }
        return num==rev;
    }

    public static boolean isAnagram(int a, int b){
        char[] st1=String.valueOf(a).toCharArray();
        char[] st2=String.valueOf(b).toCharArray();

        Arrays.sort(st1);
        Arrays.sort(st2);

        return Arrays.equals(st1,st2);
    }

    public static void main(){
        List<Integer> prime=primeNumbers(1,1000);
        Set<Integer> ans=new HashSet<>();

        for(int i:prime){
            if(isPalin(i)){
                for(int j:prime){
                    if(isAnagram(i,j)){
                        ans.add(i);
                        break;
                    }
                }
            }
        }
        System.out.println(ans);

    }
}
