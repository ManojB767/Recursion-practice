import java.util.*;
public class Leetcode_3 {
    public static void main(String[] args) {
        String s= "qswedretchvtbjyynygfd";
        System.out.println(s.length());
        lengthOfLongestSubstring(s);
    }
    static void lengthOfLongestSubstring(String s) {
        int n= s.length();
        HashSet<Character> allItems= new HashSet<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            allItems.add(s.charAt(i));
        }
        System.out.println(allItems.size());
        for(char x: allItems){
            System.out.print(x);
        }
    }
}