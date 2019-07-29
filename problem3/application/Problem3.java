package com.problem3.application;

import com.problem3.model.Solution;

public class Problem3 {

	public static void main(String[] args) {
		
		String J1="aA";
		String S1="aAAbbbb";
		
		String J2="z";
		String S2="ZZ";
		
		int output1;
		int output2;
		
		System.out.println("Find Jewels and Stones \n");
		System.out.println("Example 1:");
		System.out.println("Input J="+'"'+J1+'"'+" "+"S="+'"'+S1+'"');
		output1=Solution.countStone(J1, S1);
		System.out.println("Output="+output1+"\n");
		
		System.out.println("Example 2:");
		System.out.println("Input J="+'"'+J2+'"'+" "+"S="+'"'+S2+'"');
		output2=Solution.countStone(J2, S2);
		System.out.println("Output="+output2);
	}

}
