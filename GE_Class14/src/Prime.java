import java.util.ArrayList;
import java.util.List;

public class Prime {
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2 || num==3){
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }return true;
    }
    public static List<Integer> primeNumbers(int start, int end){
        List<Integer>prime=new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                prime.add(i);
            }
        }
        return prime;
    }

    public static void main(){
        List<Integer>prime=primeNumbers(1,1000);
        System.out.println(prime);
    }

}
