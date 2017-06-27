package com.hanbit.algorithm.grade;

import java.util.Scanner;
public class GradeReport2{
	public static void	main(String[]args){
		Scanner s = new Scanner(System.in);
		int kor=0,eng=0,math=0,total=0,avg=0;
		String grade = "";
		String result= "";
		
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
		/*
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
		}*/
		switch(avg/10){
			case 10: case 9:         /*keyword*/
				result ="장학금 대상입니다";
				grade = "A";
				break;
			case 8 :         /*keyword*/
				result ="3학점 이수";
				grade = "B";
				break;
			case 7 :         /*keyword*/
				result ="2학점 이수";
				grade = "C";
				break;
			case 6 :         /*keyword*/
				result ="1학점 이수";
				grade = "D";
				break;
			case 5 :         /*keyword*/
				result ="재수강";
				grade = "E";
				break;
			default :
				result ="학사 경고";
				break;
		}
		System.out.print("************************************\n");
		System.out.print(" 이름       총점     평균   등급\n");
		System.out.print("------------------------------------\n");
		System.out.print(String.format("|%s |     %d   |   %d   |  %s  |\n",name,total,avg,grade));
		System.out.print("************************************");
		//System.out.print(String.format("%s:%s",name,grade));
		
	}
}
