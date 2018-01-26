package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
	
	public static void main(String[] args) {
		
		//1. arrayList에 입력한 단어가 있는지 체크해서 있으면 있다고 출력하고 해당 단어를
		//삭제하고 size 출력
		//없으면 없다고 출력하는 프로그램
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("우유");
		list.add("빵");
		list.add("버터");
		list.add("사과");
		list.add("포도");
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("값을 입력 하세요 : ");
		String getName = scan.next();
		
		boolean outPut = false;
		
		for(int i = 0; i <list.size(); i++) {
			if(getName.equals(list.get(i))){
				
				outPut = true;
				list.remove(i);
				break;
			}
		}
		
		if(outPut==true) {
		System.out.println(getName+"이 리스트에 있습니다.");
		System.out.println("사이즈는 : "+list.size());
		}else {
		System.out.print(getName+"이 없습니다.");
		}
		
 }
}