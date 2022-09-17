package com.hackerrank.problemsolving;

/**
 * 
 * @author tabishmatin
 *
 */

public class JavaAnagrams {

    static boolean isAnagram(String s1, String s2) {
        
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        
        if(s1.length()==s2.length())

        {
            int[] a = new int[256]; 
            int[] b = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                a[s1.charAt(i)] += 1;
                b[s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a[i] != b[i])
                    return false;

            }
            return true;
        }
        else
        {
            return false;
        }
    }

  public static void main(String[] args) {
    
        boolean ret = isAnagram("cat", "atc");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
