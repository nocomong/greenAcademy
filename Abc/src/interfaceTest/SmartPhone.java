package interfaceTest;

public class SmartPhone extends Device implements RemoteControl, Print{
	
	
	@Override
	public void setPrice(int price) {
	
		this.price = price;
		System.out.println("스마트폰 가격 : "+price);
		
	}
	
	public void turnOn() {
		System.out.println("스마트폰 전원 On");
	}
	
	public void turnOff() {
		System.out.println("스마트폰 전원 Off");
	}
	
	public void print() {
		System.out.println("스마트폰 정보");
	}

}
