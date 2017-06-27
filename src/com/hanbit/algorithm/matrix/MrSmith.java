package com.hanbit.algorithm.matrix;

public class MrSmith{
	public static void main(String[]args){
		//int[][] mtx = new int[4][5];
		String [][] mtx = {{"Good Morning","Good Afternoon","Good Evening","Good Bye"},
						   {"Mr.","Mrs.","Miss","My"},
						   {"Smith","Alex","John","James"}
		};
		System.out.print(mtx[0][2]+"\t"+mtx[1][2]+"\t"+mtx[2][1]);
	}
	
}