package Abc;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 문자 2개를 받아서 그 두개가 같은지 다른지 비교하는 프로그램
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 문자를 입력 하세요 :");
		String text1 = scan.nextLine(); 
		System.out.print("두번째 문자를 입력 하세요 :");
		String text2 = scan.nextLine();
		
		if(text1.equals(text2)==true) 
		{
			System.out.println("동일한 문자 입니다.");
		}
		else {
			System.out.println("다른 문자 입니다.");
		}
		
	}

}
