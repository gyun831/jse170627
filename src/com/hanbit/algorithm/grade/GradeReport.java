package com.hanbit.algorithm.grade;

import java.util.Scanner;
public class GradeReport{
	public static void main(String[]args){
		//name, kor, eng, math
		//total, avg
		Scanner s = new Scanner(System.in);
		int kor=0,eng=0,math=0,total=0,avg=0;
		String grade = "";
		
		System.out.print("name :");
		String name = s.next();
		System.out.print("kor :");
		kor = s.nextInt();
		System.out.print("eng :");
		eng = s.nextInt();
		System.out.print("math :");
		math = s.nextInt();
		
		total = kor+eng+math;
		avg = total/3;
		
		if(avg>89 && avg<=100){
			grade = "A";
		}
		else if(avg>79 && avg<=89){
			grade = "B";
		}
		else if(avg>69&& avg<=79){
			grade = "C";
		}
		else if(avg>59&& avg<=69){
			grade = "D";
		}
		else if(avg>0 && avg<=59){
			grade = "E";
		}
		else{
			grade = "error";
		}
		System.out.print("************************************\n");
		System.out.print(" 이름       총점     평균   등급\n");
		System.out.print("------------------------------------\n");
		System.out.print(String.format("|%s |     %d   |   %d   |  %s  |\n",name,total,avg,grade));
		System.out.print("************************************");
		//System.out.print(String.format("%s:%s",name,grade));
		
	}
}