package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Calculator2{
	public static void main(String[] args){
		int result = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Calculator2\n");
		System.out.print("Enter num1\n");
		int a = s.nextInt();
		System.out.print("Select opcode\n");
		String opcode = s.next();
		System.out.print("Enter num2\n");
		int b = s.nextInt();
		
		if(opcode.equals("+")){
			result = a+b;
		}
		else if(opcode.equals("-")){
			result = a-b;
		}
		else if(opcode.equals("*")){
			result = a*b;
		}
		else if(opcode.equals("/")){
			result = a/b;
		}
		System.out.print(String.format("%d %s %d = %d",a,opcode,b,result));
		
	}	
}