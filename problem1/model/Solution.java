package com.problem1.model;

public class Solution {
	
	public static int singleElement(int[] input) {
		//Longitud del array.
		int len=input.length;
		int numLoops=len/2;
		int valor=0;
		int inc=0;
		
		
		//Traverse del array por pares
		for(int i=0;i<numLoops;i++) {
			
			if(input[inc]!=input[inc+1]) {
				
				valor=input[inc];
				break;
			}
			inc+=2;
			
		//Caso en el que el valor unico se encuentre al final del array
		if(i==numLoops-1){
			valor=input[len-1];
		}
		
		}
		
		return valor;
	}

}
