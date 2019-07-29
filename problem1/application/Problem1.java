package com.problem1.application;

import com.problem1.model.Solution;

public class Problem1 {

	public static void main(String[] args) {
		int[] input1= {1,1,2,3,3,4,4,8,8};
		int[] input2= {3,3,7,7,10,10,11,11,1};
		int output1;
		int output2;
		System.out.println("Find the single element from the array \n");
		
		System.out.println("Example 1:");
		System.out.print("Input:");
		System.out.print("[");
		
		for(int i=0;i<input1.length;i++) {
			System.out.print(input1[i]);
			if(i<input1.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		output1=Solution.singleElement(input1);
		System.out.println("Output: "+output1+"\n");
		
		System.out.println("Example 2:");
		System.out.print("Input:");
		System.out.print("[");
		
		for(int i=0;i<input2.length;i++) {
			System.out.print(input2[i]);
			if(i<input2.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		output2=Solution.singleElement(input2);
		System.out.println("Output: "+output2);
		
	}

}
