import java.util.Scanner;

public class ArrayTEst {

	public static void main(String[] args) {

		String [] charName = new String[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print("이름을 입력하세요 : ");
		charName[i] = input.nextLine();
		}
		
		for(int i=0 ; i <5 ; i++) {
			System.out.println((i+1)+"번째 이름은 "+charName[i]+ "입니다.");
		}

	}

}
