package Data;

public class Item {

	String hpPotion;
	
	ChrData chrData = new ChrData();
	
	public void useItem() {
		chrData.setHealth(chrData.getHealth()+150);
	}
	
}
