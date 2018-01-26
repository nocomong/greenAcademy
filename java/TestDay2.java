package Abc;

import java.util.Scanner;

public class TestDay2 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력 하세요 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력 하세요 : ");
		int num2 = scan.nextInt();
		System.out.print("세번째 숫자를 입력 하세요 : ");
		int num3 = scan.nextInt();
		
		int sum = sumTotal(num1,num2,num3);
		
		System.out.print("합은 : "+sum);
	}
	
	static int sumTotal(int a, int b, int c) 
	{
		int sumTotal = a+b+c;
		return sumTotal;
	}

}
