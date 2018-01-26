package Abc;

import java.util.Scanner;

public class reviewTest2 {

	public static void main(String[] args) {
//		3가지 숫자를 입력 받아서 평균을 리턴하는 메소드
//		return type double
//		파라미터(input) int 3개

		Scanner scan = new Scanner(System.in);
		System.out.print("첫번재 숫자 입력:");
		int num1 = scan.nextInt();
		System.out.print("두번재 숫자 입력:");
		int num2 = scan.nextInt();
		System.out.print("세번재 숫자 입력:");
		int num3 = scan.nextInt();
		
		double result = average(num1,num2,num3);
		System.out.print("평균 : "+result);
		
		
		
	}
	
	static double average(int a, int b, int c)
	{
		double average=(a+b+c)/3;
		return average;
	}

}
