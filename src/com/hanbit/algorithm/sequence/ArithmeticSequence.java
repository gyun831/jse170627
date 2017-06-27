package com.hanbit.algorithm.sequence;

import java.util.Scanner;
public class ArithmeticSequence{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.print("단수를 입력하세요\n");
		int a = s.nextInt();
	
		for(int i=1;i<10;i++){
			System.out.print("\n");			
			for(int j=a;j<10;j++){
				System.out.print(String.format("%d * %d = %d\t",j,i,j*i));
			}
			
		}
	}
}