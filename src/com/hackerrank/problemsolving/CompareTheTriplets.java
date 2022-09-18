package com.hackerrank.problemsolving;

import java.util.*;

class Process {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    
      int aScore = 0, bScore = 0;
      
      for(int i = 0; i<3; i++)
        {
          if(a.get(i)>b.get(i))
            aScore++;
          else if(a.get(i)<b.get(i))
            bScore++;
          else if(a.get(i)==b.get(i))
            aScore+=0;
            bScore+=0;
        }
    
      List<Integer> output = new ArrayList<>();
      output.add(aScore);
      output.add(bScore);
      return output;
             } 
}

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> aScore = new ArrayList<>();
        List<Integer> bScore = new ArrayList<>();
        aScore.add(5);
        aScore.add(6);
        aScore.add(7);
        bScore.add(3);
        bScore.add(6);
        bScore.add(10);
        System.out.println(Process.compareTriplets(aScore, bScore));
    }
}


