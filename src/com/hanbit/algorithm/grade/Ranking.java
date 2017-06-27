package com.hanbit.algorithm.grade;

import java.util.Scanner;
public class Ranking{
	public static void main(String[]args){
		System.out.println("###### 성적 랭킹 ######");
		Scanner scan = new Scanner(System.in);
		int big=0;
		String change="";
		
		int[] arr = new int[3];
		String[] names = new String[3];
		for(int i=0; i<3; i++){
			System.out.println("이름을 입력하세요");
			names[i] = scan.next();
			System.out.println("점수를 입력하세요");
			arr[i] = scan.nextInt();
		}
		
		if(arr[1]>arr[0] && arr[1]>arr[2]){
			big=arr[0];
			change=names[0];
			arr[0]=arr[1];
			names[0]=names[1];
			arr[1]=big;
			names[1]=change;
		}
		else if(arr[2]>arr[0] && arr[2]>arr[1]){
			big=arr[0];
			change=names[0];
			arr[0]=arr[2];
			names[0]=names[2];
			arr[2]=big;
			names[2]=change;
		}
		if (arr[2]>arr[1]){
			big=arr[1];
			change=names[1];
			arr[1]=arr[2];
			names[1]=names[2];
			arr[2]=big;
			names[2]=change;
		}
		
		
		
		System.out.print(String.format("1등 %s : %d점\n2등 %s : %d점\n3등 %s : %d점",names[0],arr[0],names[1],arr[1],names[2],arr[2]));
	}
}