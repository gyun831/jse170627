package com.hanbit.algorithm.member;

import java.util.Scanner;
public class Login{
	public static final String USER_ID="kim";
	public static final String USER_PASS="1";
	public static void main(String[]agrs){
		Scanner s = new Scanner(System.in);
		System.out.print("로그인\n");

		
		System.out.print("ID :");
		String id = s.next();
		System.out.print("PASS :");
		String pw = s.next();
		String result = "";
		if(!id.equals(USER_ID)){
			result="ID틀림";
		}
		else if(pw.equals(USER_PASS)){
			result="로그인성공";
		}
		else{
			result="PW틀림";
		}
		System.out.print(result);
	}	
}
	
	

