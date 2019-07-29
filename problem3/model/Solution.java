package com.problem3.model;

public class Solution {
	
	public static int countStone(String j, String s) {
		int lenS=s.length();
		int lenJ=j.length();
		int stone;
		int jewel;
		int contador=0;
		
		for(int i=0;i<lenS;i++) {
			for(int k=0;k<lenJ;k++) {
				stone=s.charAt(i);
				jewel=j.charAt(k);
				
				if(stone==jewel) {
					contador++;
				}
			}
		}
		return contador;
		
	}
}
