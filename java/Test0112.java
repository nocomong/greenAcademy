package Abc;

import java.util.Scanner;

public class Test0112 {

	public static void main(String[] args) {

		int a,b,c;
		
		System.out.print("첫번째 정수를 입력하시오 : ");
		Scanner firstInput = new Scanner(System.in);
		
		a = firstInput.nextInt();
		
		System.out.print("두번째 정수를 입력하시오 : ");
		Scanner secInput = new Scanner(System.in);
		
		b = secInput.nextInt();
		
		System.out.print("세번째 정수를 입력하시오 : ");
		Scanner thirdInput = new Scanner(System.in);
		
		c = thirdInput.nextInt();
		
		if(a>b) 
		{
			if(a>c) 
			{
				System.out.println("높은 수 : "+a);
				
				if(b>c) 
				{
					System.out.println("중간 수 : "+b);
					System.out.println("낮은 수 : "+c);
				}
			}
			else
			{
					System.out.println("중간 수 : "+c);
					System.out.println("낮은 수 : "+b);
			}
		}
		
		else if(b>c) 
		{
			System.out.println("높은 수 :"+b);
			if(a>c)
			{
				System.out.println("중간 수 : "+a);
				System.out.println("낮은 수 : "+c);
			}
			else 
			{
				System.out.println("중간 수 : "+c);
				System.out.println("낮은 수 : "+a);
			}
		}
		else 
		{
			System.out.println("높은 수 : "+c);
			if(a>b) 
			{
				System.out.println("중간 수 : "+a);
				System.out.println("낮은 수 : "+b);
			}
			else
			{
				System.out.println("중간 수 : "+b);
				System.out.println("낮은 수 : "+a);
			}
		}
	}

}
