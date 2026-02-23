package classTask2;

public class Human extends Monster {

	private int gold = 30;
	private String item = "워모그의갑옷";

	public int getGold() {
		return gold;
	}
	public String getItem() {
		return item;
	}
	public void attack() {
		System.out.println("휴먼이 숨는다!");
	}

	public void dropItem() {
		System.out.println("갑옷을 얻는다.");
	}
}
