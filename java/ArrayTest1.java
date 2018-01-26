package Abc;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
//숫자 2개를 입력 받아서 2수를 더하는 출력하는 프로그램

		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력 하세요 :");
		int number1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력 하세요 :");
		int number2 = scan.nextInt();
		
		add(number1,number2);
		
		
	}

	static void add(int a, int b) 
	{
		System.out.print("두 수의 합은 :"+(a+b));
	}
}


