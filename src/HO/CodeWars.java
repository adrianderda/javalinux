package HO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWars {

    public boolean isValid(String braces) {
        if(braces.equals(new StringBuilder(braces).reverse().toString())){
           return true;
        }
        else{
            return false;
        }
    }


    public String spinWords(String sentence) {

        List<String> tempList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        List<String> newList = new ArrayList<>();
        for (String s : tempList) {
            if (s.length()<5){
                newList.add(s);
            }else{
                String var = new StringBuilder(s).reverse().toString();
                newList.add(var);
            }
        }


        return String.valueOf(newList);
    }

    public static int countBits(int n){
        return Integer.bitCount(n);
    }

    public int solution(int number) {
        int temp = 0;
        for(int i=0;i<number;i++){
            if((i%3)==0 || (i%5)==0){
                temp+=i;
            }
        }
        return temp;
    }




    public static void main(String[] args) {

        CodeWars codeWars = new CodeWars();


        System.out.println(codeWars.solution(10));
    }
}
