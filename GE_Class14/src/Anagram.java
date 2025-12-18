import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    public static boolean anagram(String A, String B){
        if(A.length()!=B.length()){
            return false;
        }
        Map<Character ,Integer> mp = new HashMap<>();
        for(char ch:A.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for(char ch:B.toCharArray()){
            if (!mp.containsKey(ch) || mp.get(ch) == 0){
                return false;
            }
            mp.put(ch, mp.getOrDefault(ch, 0) - 1);
        }
        return true;
    }

    public static void main(String[] args){
        Scanner A= new Scanner(System.in);
        String a=A.nextLine();
        Scanner B= new Scanner(System.in);
        String b=B.nextLine();

        if(anagram(a,b)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
