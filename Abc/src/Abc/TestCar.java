package Abc;

public class TestCar {

	public static void main(String[] args) {
	
		SportsCar c = new SportsCar();
		
		c.color = "red";
		
		
		c.setTurbo(true);
		
		c.speedUp(200);
		
		c.speedDown(50);
		
		c.print();
		
		
		//오버로딩 : 메소드 이름은 같은데 입력 같이 스트링 , 인트 등의 인풋값이 틀릴때
		//오버라이딩 : 기존 부모데이터를 덮어쓸때
		
//		SUVCar suv = new SUVCar();
//		suv.color = "blue";
//		suv.gear=6;
//		suv.speed=100;
//		suv.setHeight(100);
//		suv.printH();

	}

}
