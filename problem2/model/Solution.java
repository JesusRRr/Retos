package com.problem2.model;

import java.util.ArrayList;

public class Solution {
	
	public static boolean isHappyNumber(int num) {
		boolean ban=true;
		boolean isHappy=false;
		int[] digits;
		int outNum;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		digits=splitDigits(num);
		outNum=sumSquareDigits(digits);
		numbers.add(num);
		
		while(ban) {
			if(num==1) {
				ban=false;
				isHappy=true;
			}
			numbers.add(outNum);
			digits=splitDigits(outNum);
			outNum=sumSquareDigits(digits);
			
			
			if(outNum==1) {
				ban=false;
				isHappy=true;
			}else {
				
				ban=noElementRepeat(numbers);
				
			}
			
		}

		return isHappy;
	}
	
	public static boolean noElementRepeat(ArrayList<Integer> list){
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		boolean isRepeat=true;
		int cont=0;
		
		
		for(int i=0;i<list.size()-1;i++) {
			cont=0;
			for(int j=1+i;j<list.size();j++) {
				
				if(list.get(i)==list.get(j)) {
					cont++;
				}
				
				if(cont>0) {
					//Rompemos el ciclo padre
					i=list.size()-1;
					isRepeat=false;
					break;
				}
				
				
				
				
				/*This part of code is an alternative if we want to know if the digits in one number are repeat
				 * Example: "58" and "85" are not the same number but have the same digits.
				 
				//digits=splitDigits(list.get(i));
				//digits2=splitDigits(list.get(j));
				
				for(int k=0;k<digits.length;k++) {
					
					for(int l=0;l<digits2.length;l++) {
						
						if(digits[k]==digits2[l]) {
							cont++;
						}
						
						if(cont==digits.length && cont==digits2.length){
							k=digits.length;
							j=list.size();
							i=list.size();
							isRepeat=false;
							break;
						}
					}
				}
				*/
			}
		}
		
		
		
		return isRepeat;
	}
	
	private static int[] splitDigits(int num) {
		String numString=String.valueOf(num);
		int len=numString.length();
		int[] digits=new int[len];
		
		for(int i=0;i<len;i++) {
			digits[i]=numString.charAt(i)-48;
		}
		
		
		return digits;
	}
	
	private static int sumSquareDigits(int[] digits) {
		int sumSquare=0;
		int len=digits.length;
		for(int digit:digits) {
			sumSquare+=Math.pow(digit,2);
		}
		return sumSquare;
	}
}
