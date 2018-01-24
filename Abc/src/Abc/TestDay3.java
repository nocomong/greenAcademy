package Abc;

import java.util.Scanner;

public class TestDay3 {

	public static void main(String[] args) {
//		// 리턴타입 void 이름은 showMyName, 입력값 없음
//		showMyName();
//
//	}
//
//	static void showMyName() 
//	{
//		System.out.print("박진수");
//	}
		
		
//		2개의 문자열을 받아서 같으면 같습니다. 틀리면 틀립니다.
//		return type boolean
//		이름 isSame
//		input String 2개
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력1:");
		String name1 = scan.nextLine();
		System.out.print("문자 입력2:");
		String name2 = scan.nextLine();
		
		boolean same = isSame(name1,name2);
		
		System.out.print(same);
		
		
	}
	
	static boolean isSame(String a, String b)
	{
		boolean same = a.equals(b);
		return same;
	}
	
}