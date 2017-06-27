package com.hanbit.algorithm.sequence;

import java.util.Scanner;
public class TopRanking{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int sum=0,avg=0,max=0,min=100,temp=0;
		System.out.print("1반의 총학생수는 몇명?:");
		int students = s.nextInt();
		
		int[] score = new int[students];
		for(int i=0; i<students;i++){
		System.out.print("학생의 점수를 입력하세요(100점만점)?");
		score[i] = s.nextInt();
		}
		
		for(int i=0;i<score.length;i++){
				if(score[i]>max){
					max = score[i];
				}
				if(min>score[i]){
					min = score[i];
				}
				sum+= score[i];
			}
				
		avg = sum/students;
			
		System.out.println("1반의 평균점수는" + avg);
		System.out.println("최대 점수는" +max);
		System.out.println("최소 점수는" +min);
	}
}