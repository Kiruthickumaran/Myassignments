package week2day3assignments;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	
       String text1="stops";
       String text2="potss";
       
       char a[] = text1.toCharArray(); 
       char b[] = text2.toCharArray();
       
       
       Arrays.sort(a);
       Arrays.sort(b);
       
       boolean results=Arrays.equals(a,b);
       if (results==true) {
    	   System.out.println("string are anagram");
    	   
       }else {
    	   System.out.println("string are not anagram");
       }
}
}
