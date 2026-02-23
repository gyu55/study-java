package classTask2;

public class Fairy extends Monster{
	private int gold = 20;
	private String item = "요정의날개";
	
	public int getGold() {
		return gold;
	}
	public String getItem() {
		return item;
	}
	
	public void attack() {
		System.out.println("요정이 마법을 사용한다!");
	}
	public void dropItem() {
		System.out.println("날개를 얻는다.");
	}
}
