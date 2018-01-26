package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//숫자 2개를 입력 받아서 더하는 프로그램을 만드는데 문자를 치더라도 죽으면 안됨.
		int a = 0;
		int b = 0;
//		int aCount =0;
//		int bCount =0;
		
		int result = 0;
//		boolean error = true;
		
		
		System.out.print("a숫자를 입력하세요.");
		
		while(true) {
		try {
		a = sc.nextInt();
		break;
		}
		catch(Exception e){
			
			System.out.print("숫자를 입력하세요.");
			sc = new Scanner(System.in);	
			
		}
		}
		
		
	
		
		System.out.print("b숫자를 입력하세요.");
		while(true)
		try {
		b = sc.nextInt();
		break;
		}
		catch(Exception f) {
			sc = new Scanner(System.in);
			System.out.print("b숫자를 입력하세요.");
		
		}
		
		
		result = a+b;
		
		System.out.print("합 = "+result);
		
		}
	}

	
		
		
		
		

	


