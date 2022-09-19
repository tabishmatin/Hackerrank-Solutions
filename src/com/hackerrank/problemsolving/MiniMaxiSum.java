package com.hackerrank.problemsolving;

/**@author aabiyah
 * 
 */

import java.util.*;


class MiniMaxiSumAnswer {

    public static int miniMaxSum(List<Integer> arr) {
    	int sum = 0;
    	int max = Collections.max(arr);
    	int min = Collections.min(arr);
    	for(Integer i :arr) {
    		sum+=i; 
    	}
    	System.out.println((sum-max) + " " + (sum-min));
		return 0;
    }

}


public class MiniMaxiSum {
	 public static void main(String[] args) {
	    	List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        Collections.sort(list);
	        int result = MiniMaxiSumAnswer.miniMaxSum(list);
	        System.out.println(result);
	    }

}
