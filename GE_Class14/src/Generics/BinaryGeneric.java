package Generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryGeneric {
    public static <T extends Comparable<T>> boolean binSearch(T[] strArr, T keyWord){
        int l=0; int h=strArr.length -1;

        while(l<=h){
            int mid=(l+h)/2;
            int comp=keyWord.compareTo(strArr[mid]);       //im comparing lexicographically
            if(comp==0){
                return true;
            } else if (comp > 0) {
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        try{
            Scanner ip=new Scanner(System.in);
            File f=new File("src/words.txt");
            Scanner file=new Scanner(f);
            String line=file.useDelimiter("\\Z").next();
            String[] words=line.split(",");

            file.close();
            Arrays.sort(words);

            String key=ip.nextLine().trim();

            if(binSearch(words,key)){
                System.out.println("Found");
            }else{
                System.out.println("not found");
            }
            ip.close();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}


