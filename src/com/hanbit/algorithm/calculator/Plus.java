package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Plus{
	public static void main(String[]args){
		System.out.print("Plus");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Integer\n");
		int num1 = s.nextInt();
		System.out.print("Enter Integer\n");
		int num2 = s.nextInt();
		int sum = num1+num2;
		System.out.print("Result :"+sum);
}}