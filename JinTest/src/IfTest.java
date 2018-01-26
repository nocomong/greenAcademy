
public class IfTest {

	public static void main(String[] args) {

		int [] array = new int [5];
//		array[0]
//		array[4]
		
		
		for (int i=0 ; i <array.length ; i++) 
		{
			for(int j=0; j<array.length-i; j++) {
				System.out.print("*");
			}
			System.out.println();
					
		}
		
	}

}

