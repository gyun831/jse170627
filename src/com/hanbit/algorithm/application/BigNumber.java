package com.hanbit.algorithm.application;

import java.util.Scanner;
public class BigNumber{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int big=0,a=0,b=0,c=0;
		
		System.out.print("A의 값을 입력하세요.\n");
		a = s.nextInt();
		System.out.print("B의 값을 입력하세요.\n");
		b = s.nextInt();
		System.out.print("C의 값을 입력하세요.\n");
		c = s.nextInt();
		
		if(b>a){
			big=b;
			b=a;
			a=big;
		}
		if(c>b){
			big=c;
			c=b;
			b=big;
		}
		if(b>a){
			big=b;
			b=a;
			a=big;
		
		}
		System.out.print(String.format("큰순나열: %d,%d,%d",a,b,c));
		
	}
}