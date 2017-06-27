package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Calculator{
	public static void main(String[]args){
		int result = 0;
		System.out.print("Calculator\n");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Integer\n");
		int num1 = s.nextInt();
		System.out.print("Enter Integer\n");
		int num2 = s.nextInt();
		System.out.print("Select opcode: 1.+ 2.- 3.* 4./ \n");
		int opcode = s.nextInt();
	
		if(opcode==1){
				result = num1+num2;
			}
			else if(opcode==2){
				result = num1-num2;
			}
			else if(opcode==3){
				result = num1*num2;
			}
			else if(opcode==4){
				result = num1/num2;
			}
	System.out.print("result:"+result);
	
	}
}