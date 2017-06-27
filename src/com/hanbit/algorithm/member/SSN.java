package com.hanbit.algorithm.member;

import java.util.Scanner;
public class SSN{
	public static void main(String[]agrs){
		Scanner s = new Scanner(System.in);
		int year = 0, gap = 0,age=0;
		String gender = "";
		String name = "";
		String ssn = "";
		System.out.print("이름을 입력하세요\n");
		name = s.next();
		System.out.print("주민등록번호를 입력하세요\n");
		ssn=s.next();
		String sYear = ssn.substring(0,2);
		year = Integer.parseInt(sYear);
		
		/*		
		if(gap>=0){
			age = 2017-(year+2000)+1;
		}
		else{
			age = 2017-(year+1900)+1;
		}
		*/
	
		
		
		
		char ch = ssn.charAt(7); //ssn문자열에 7번째문자
		switch(ch){
			case '1': 
			case '3': //char type은 ''
				gender = "남";
				break;
			case '2': 
			case '4':
				gender = "여";
				break;
			case '5':
				gender = "외국인(남)";
				break;
			case '6':
				gender = "외국인(여)";
				break;
				
			default :
				gender = "FAIL";
				break;
		}
		System.out.print("************************************\n");
		System.out.print(" 이름       나이     성별\n");
		System.out.print("------------------------------------\n");
		System.out.print(String.format("|%s |     %d   |   %s  |\n",name,((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1,gender));
		System.out.print("************************************");
	}
}