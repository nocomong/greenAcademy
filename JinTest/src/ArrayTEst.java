import java.util.Scanner;

public class ArrayTEst {

	public static void main(String[] args) {

		String [] charName = new String[5];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
		charName[i] = input.nextLine();
		}
		
		for(int i=0 ; i <5 ; i++) {
			System.out.println((i+1)+"��° �̸��� "+charName[i]+ "�Դϴ�.");
		}

	}

}
