package com.hackerrank.problemsolving;

import java.util.*;

class Result {
	
	public static int solution(List<Integer> ar) {
	 
	    int sum = 0;
	    for (Integer i : ar) {       
	             sum += i;
	             }
	    return sum;
	    }

}

public class SimpleArraySum {
	
    public static void main(String[] args) {
    	List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(11);
        System.out.println(Result.solution(list));
    }
}

 