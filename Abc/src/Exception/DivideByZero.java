package Exception;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("피젯수 : ");
		x = sc.nextInt();
		System.out.print("젯수 : ");
		y = sc.nextInt();
		int result =0;
		try {
		result = x/y;
		}
		
		catch(Exception e) {
			System.out.println("오류발생");
		}
		finally {
			System.out.println("try/catch 통과");
			
		}
		System.out.print("나눗셈의 결과 : "+ result);
		

	}

}
