package com.problem2.application;

import java.util.ArrayList;
import java.util.Scanner;

import com.problem2.model.Solution;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("Find if a number is happy \n");
		Scanner input=new Scanner(System.in);
		System.out.print("Ingresa un numero: ");
		int number=input.nextInt();
		System.out.print("Is "+number+" a happy number? ");
		System.out.println(Solution.isHappyNumber(number));
	}
}
