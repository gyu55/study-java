package classTask2;

public class Character extends Monster {
	private int level;
	private String nickname;
	private int gold;
	private String item;
	
	public Character() {;}
	
	public Character(int level, String nickname, int gold, String item) {
		this.level = level;
		this.nickname = nickname;
		this.gold = gold;
		this.item = item;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		System.out.println(gold + "골드를 획득했습니다.");
		this.gold += gold;
		System.out.println("현재 보유한 골드 : " + this.gold);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item += item;
	}

	public void levelUp() {
		System.out.println("캐릭터의 레벨이 올랐습니다.");
		this.level++;
		System.out.println("현재 레벨 = " + this.level);
	}
	public void takeGold(int money) {
		System.out.println(money + "골드를 획득했습니다.");
		this.gold += money;
		System.out.println("현재 보유한 골드 : " + this.gold);
	}
	public void showItem() {
		System.out.println("현재 보유한 아이템 = " + this.item);
	}
	
}
