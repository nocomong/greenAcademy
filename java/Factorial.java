package Abc;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		long fact = 1;
		int n;
		
		System.out.printf("정수를 입력 하시오 : ");
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		
		for(int i =1 ; i <= n; i++)
		{
			fact = fact * i;
			System.out.printf("%d!은 %d 입니다.\n",n,fact);
		}

	}

}
