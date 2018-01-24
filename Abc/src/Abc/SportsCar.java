package Abc;

class SportsCar extends Car {

	boolean turbo;
	
	public void setTurbo(boolean newValue) {
	turbo = newValue;	
	}
	
	public void speedUp(int increment) {
		speed += increment*2;
	}
	public void speedDown(int decrement) {
		speed -= decrement*2;
	}
	
	
}


class SUVCar extends Car{
	
	int height;
	
	public void setHeight(int h) {
		this.height = h;
	}
	
	public void printH() {
		print();
		System.out.print("차고의 높이 : "+height);
	}
	
}
