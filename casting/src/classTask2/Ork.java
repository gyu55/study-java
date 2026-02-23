package classTask2;

public class Ork extends Monster {

	private int gold = 40;
	private String item = "오크의가죽";
	
	public int getGold() {
		return gold;
	}
	public String getItem() {
		return item;
	}

	public void attack() {
		System.out.println("오크가 달려든다!");
	}

	public void dropItem() {
		System.out.println("가죽 얻는다.");
	}
}
