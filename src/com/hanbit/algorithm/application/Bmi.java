package com.hanbit.algorithm.application;

import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("나의 체질량지수(BMI)는?\n");
		System.out.print("Height :\n");
		double height = s.nextDouble();
		System.out.print("Weight :\n");
		double weight = s.nextDouble();
		double bmi = weight/(height*height);
		String result="";
		System.out.print(bmi);
		
		if(bmi>=30){
		result="비만";
		}
		else if(bmi>=25){
			result="과체중";
		}
		else if(bmi>=18.5){
			result="정상";
		}
		else{
			result="저체중";
		}
		System.out.print(result);
	
		}
}

