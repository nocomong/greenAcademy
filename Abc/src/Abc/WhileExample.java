package Abc;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {

		int dan;
		int su=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("단수를 입력하시오 : ");
		
		dan = input.nextInt();
		
		while( su < 10 )
		{
			System.out.println(dan +"x" + su + " = " + dan * su);
			su++;
		}
	}

}
