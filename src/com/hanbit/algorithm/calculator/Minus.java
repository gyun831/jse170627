package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Minus{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Integer\n");
		int num1 = scan.nextInt();
		System.out.print("Enter Integer\n");
		int num2 = scan.nextInt();
		int sum = num1-num2;
		System.out.print("Result :"+sum);
	}
}