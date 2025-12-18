import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation {
    public static List<String> iterative(String s){
        List<String> res=new ArrayList<>();
        res.add("");
        for(char ch:s.toCharArray()){
            List<String> newPerm =new ArrayList<>();
            for(String st:res){
                for(int i=0;i<=st.length();i++){
                    newPerm.add(st.substring(0,i)+ch+st.substring(i));
                }
            }
            res=newPerm;
        }
        return res;
    }

    public static void helper(String st, String perm, List<String> res){
        if(st.isEmpty()){
            res.add(perm);
            return;
        }

        for(int i=0;i<st.length();i++){
            String rest=st.substring(0,i) + st.substring(i+1);
            helper(rest,perm+st.charAt(i),res);
        }
    }

    public static List<String> recursive(String s){
        List<String> res=new ArrayList<>();
        helper(s,"",res);
        return res;
    }

    public static void main(){
        String st="jagat";

        List<String> it=iterative(st);
        Collections.sort(it);
        List<String> rec=recursive(st);
        Collections.sort(rec);

        if(it.equals(rec)){
            System.out.println("Same permutations");
        }else{
            System.out.println("Not Same permutations");
        }

//        for(String i:it){
//            System.out.println(i);
//        }
    }
}

